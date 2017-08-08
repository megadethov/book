import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.webservices.Customer;
import ua.mega.webservices.CustomerEndpoint;
import ua.mega.webservices.CustomerNotFoundException_Exception;
import ua.mega.webservices.CustomerService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CustomerEndpoint service = new CustomerService().getCustomerEndpointPort(); without Spring

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("client.xml");
        CustomerEndpoint service = (CustomerEndpoint) container.getBean("customerService");


        try {
            System.out.println(service.getFullCustomerDetail("1").getCompanyName());
           /* List<Customer> customers = service.getAllCustomers(); // NOT WORK
            System.out.println(customers.size());*/
        } catch (CustomerNotFoundException_Exception e) {
            System.out.println("Customer not found...");
        }
    }
}
