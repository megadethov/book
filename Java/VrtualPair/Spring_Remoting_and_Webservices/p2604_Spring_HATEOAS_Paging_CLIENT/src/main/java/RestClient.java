import org.springframework.hateoas.Link;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RestClient {
    public static void main(String[] args) throws IOException {
        RestTemplate template = new RestTemplate();
        template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
        template.setErrorHandler(new CustomExceptionHandler(template));

        CustomerCollectionRepresentation allCustomers = template.getForObject("http://localhost:8080/mywebapp/customers?first=1&last=2", CustomerCollectionRepresentation.class);

        Link link = allCustomers.getLink("next");
        System.out.println("the next page will be at " + link);

        System.out.println(allCustomers);
    }
}
