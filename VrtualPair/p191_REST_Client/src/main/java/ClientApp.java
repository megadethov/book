import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import java.util.List;

public class ClientApp {
    public static void main(String[] args) {
        Client client = Client.create();
        WebResource web = client.resource("http://localhost:8080/webapp/webservice/employees/1251");
        Employee employee = web.get(Employee.class);

        System.out.println("Employee name is: " + employee.getFirstName() + " " + employee.getSurname());

//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        web = client.resource("http://localhost:8080/webapp/webservice/employees");
        List<Employee> allEmployees = web.get(new GenericType<List<Employee>>() {});

        for (Employee next : allEmployees) {
            System.out.println(next.getFirstName() + " " + next.getSurname());
        }

    }
}
