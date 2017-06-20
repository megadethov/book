package ua.mega.staffmanagement.rest;

import ua.mega.staffmanagement.EmployeeManagementServiceLocal;
import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

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
}
