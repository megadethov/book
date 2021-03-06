package ua.mega.staffmanagement.rest;

import com.sun.jersey.api.client.ClientResponse;
import ua.mega.staffmanagement.EmployeeManagementServiceLocal;
import ua.mega.staffmanagement.SystemUnavailableException;
import ua.mega.staffmanagement.dataaccess.EmployeeNotFoundException;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Path("/employees")
public class EmployeeResource {

    @EJB
    EmployeeManagementServiceLocal service;

    @GET
    @Produces("application/xml")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GET
    @Produces("application/xml")
    @Path("{id}")
    public Employee findEmployeeById(@PathParam("id") int id) {
        try {
            return service.getEmployeeById(id);
        } catch (EmployeeNotFoundException e) {
            return null;
        }
    }

    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    public /*Employee*/ Response createNewEmployee(Employee employee) {
        try {
            service.registerEmployee(employee);
//            return employee; // not work
            return Response.ok().entity(employee).build();
        } catch (Exception e) {
            return Response.status(ClientResponse.Status.SERVICE_UNAVAILABLE).build();
        }
    }

    @DELETE
    @Path("{id}")
    public /*void*/ Response deleteEmployeeById(@PathParam("id") int id) {
        try {
            service.deleteEmployeeById(id);
            return Response.ok().build();
        } catch (EmployeeNotFoundException e) {
            return Response.status(ClientResponse.Status.NOT_FOUND).build();
        }
    }
}
