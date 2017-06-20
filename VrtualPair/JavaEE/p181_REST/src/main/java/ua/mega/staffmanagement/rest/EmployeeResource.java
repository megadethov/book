package ua.mega.staffmanagement.rest;

import ua.mega.staffmanagement.domain.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/employees")
public class EmployeeResource {

    @GET
    @Produces("application/xml")
    public List<Employee> getAllEmployees() {
        List<Employee> result = new ArrayList<Employee>();
        result.add(new Employee("Vasya", "Pupkin", "boss", 100000));
        result.add(new Employee("Petr", "Petrov", "driver", 200));
        return result;
    }
}
