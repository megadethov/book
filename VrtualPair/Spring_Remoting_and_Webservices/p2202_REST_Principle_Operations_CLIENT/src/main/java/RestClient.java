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

        HttpHeaders headers = new HttpHeaders();
        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
        acceptableMediaTypes.add(MediaType.IMAGE_JPEG);
//        acceptableMediaTypes.add(MediaType.APPLICATION_XML);
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
        headers.setAccept(acceptableMediaTypes);

        //a new customer
        CustomerClientVersion customer = new CustomerClientVersion();
        customer.setCompanyName("sclep");
        customer.setNotes("some notes");

//        customer = template.postForObject("http://localhost:8080/mywebapp/customers", customer, CustomerClientVersion.class);
//        System.out.println(customer.getCustomerId());

        ResponseEntity<CustomerClientVersion> customerEntity = template.postForEntity("http://localhost:8080/mywebapp/customers", customer, CustomerClientVersion.class);
        System.out.println(customerEntity.getStatusCode());

        HttpEntity requestEntity = new HttpEntity(headers);

       /* HttpEntity response = template.exchange("http://localhost:8080/mywebapp/customers", HttpMethod.GET, requestEntity, String.class);
        System.out.println(response.getBody());*/

        HttpEntity<CustomerCollectionRepresentation> response = template.exchange("http://localhost:8080/mywebapp/customers", HttpMethod.GET, requestEntity, CustomerCollectionRepresentation.class);
        CustomerCollectionRepresentation results = response.getBody();
        System.out.println(results);

    }
}
