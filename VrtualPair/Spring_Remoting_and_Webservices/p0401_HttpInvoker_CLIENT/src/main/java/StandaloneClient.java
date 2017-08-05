import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;


public class StandaloneClient {

    public static void main(String[] args) {
        // Access the remote Customer Management Service
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("rmi-client.xml");

        CustomerManagementService service = container.getBean(CustomerManagementService.class);

        // This is a NETWORK call!
        List<Customer> allCustomers = service.getAllCustomers();
        for (Customer next : allCustomers) {
            System.out.println(next.getCompanyName() + "; " + next.getCustomerId());
        }

		try
		{
			Customer fullCustomer = service.getFullCustomerDetail("shajhfahfa");
			System.out.println(fullCustomer.getCalls().size() + " calls");
		}
		catch (CustomerNotFoundException e)
		{
			System.out.println("Customer doesn't exist");
		}

        container.close();
    }

}
