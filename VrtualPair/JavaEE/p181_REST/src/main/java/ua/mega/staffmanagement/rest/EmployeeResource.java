package ua.mega.staffmanagement.rest;

import ua.mega.staffmanagement.EmployeeManagementServiceLocal;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
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
    public Employee findEmployeeById(@PathParam("id") String id) {
        return new Employee("Stub", "Stub", "Stub", 1);
    }

    @POST
    @Produces("application/xml")
    @Consumes("application/xml")
    public Employee createNewEmployee(Employee employee) {
        service.registerEmployee(employee);
        return employee;
    }
}
