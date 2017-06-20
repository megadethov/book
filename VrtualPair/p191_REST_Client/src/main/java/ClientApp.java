import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class ClientApp {
    public static void main(String[] args) {
        Client client = Client.create();
        WebResource web = client.resource("http://localhost:8080/webapp/webservice/employees/1251");
        Employee employee = web.get(Employee.class);

        System.out.println("Employee name is: " + employee.getFirstName() + " " + employee.getSurname());
    }
}
