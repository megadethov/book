import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import java.util.List;

public class ClientApp {
    public static void main(String[] args) {

        Client client = Client.create();

        //for security
        client.addFilter(new HTTPBasicAuthFilter("mega", "mega"));

        WebResource web = client.resource("http://localhost:8080/webapp/webservice/employees");
        List<Employee> allEmployees = web.get(new GenericType<List<Employee>>() {});

        for (Employee next : allEmployees) {
            System.out.println(next.getFirstName() + " " + next.getSurname());
        }

//        ++++++++++ create new Employee +++++++++++++
     /*   web = client.resource("http://localhost:8080/webapp/webservice/employees");
        Employee newEmployee = new Employee();
        newEmployee.setFirstName("James3");
        newEmployee.setSurname("Gosling3");
        newEmployee.setJobRole("Java Creator3");
        newEmployee.setSalary(3000000);*/

//        Employee registeredEmployee = web.post(Employee.class, newEmployee);
      /*  ClientResponse response = web.post(ClientResponse.class, newEmployee);

        System.out.println("The response code was: " + response.getStatus());

        if (response.getStatus() == 200) {
            System.out.println(response.getEntity(Employee.class).getId());
        }*/


    }
}
