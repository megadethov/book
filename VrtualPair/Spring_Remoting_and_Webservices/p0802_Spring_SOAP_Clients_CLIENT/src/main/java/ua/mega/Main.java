package ua.mega;

import ua.mega.webservices.Customer;
import ua.mega.webservices.CustomerEndpoint;
import ua.mega.webservices.CustomerNotFoundException_Exception;
import ua.mega.webservices.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerEndpoint service = new CustomerService().getCustomerEndpointPort();

        try {
            Customer customer = service.getFullCustomerDetail("1");
            System.out.println(customer.getCompanyName());
        } catch (CustomerNotFoundException_Exception e) {
            System.out.println("Customer not found...");
        }
    }
}
