import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RestClient {
    public static void main(String[] args) throws IOException {

        RestTemplate template = new RestTemplate();
        template.setErrorHandler(new CustomExceptionHandler(template));

        CustomerClientVersion customer;
        customer = template.getForObject("http://localhost:8080/mywebapp/customer/102", CustomerClientVersion.class);

        System.out.println(customer.getCustomerId() + " " + customer.getCompanyName());

        // Seat and wait...

        // update
        customer.setCompanyName("Apple");
        try
        {
            template.put("http://localhost:8080/mywebapp/customer/102", customer);
        }
        catch (EditingConflictException e)
        {
            System.out.println("Sorry, someone else got in first, please try again.");
        }
        // Final step
        customer = template.getForObject("http://localhost:8080/mywebapp/customer/100029",
                CustomerClientVersion.class);

        System.out.println("To confirm, the customers company is now " + customer.getCompanyName());

    }
}
