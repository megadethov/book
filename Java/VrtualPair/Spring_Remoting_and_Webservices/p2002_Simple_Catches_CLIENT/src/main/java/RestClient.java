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

        HttpHeaders headers = new HttpHeaders();
        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
        acceptableMediaTypes.add(MediaType.IMAGE_JPEG);
//        acceptableMediaTypes.add(MediaType.APPLICATION_XML);
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
        headers.setAccept(acceptableMediaTypes);

        HttpEntity requestEntity = new HttpEntity(headers);

        try {
            HttpEntity response = template.exchange("http://localhost:8080/mywebapp/customer/122132341", HttpMethod.GET, requestEntity, String.class);
            System.out.println(response.getBody());
        } catch (HttpClientErrorException e) {
//            System.out.println("Sorry, the customer was not found...");

            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
                System.out.println("Sorry, the customer was not found " + e.getResponseBodyAsString());
            } else {
                System.out.println("Some other error occured " + e.getStatusCode());
            }
        }
    }
}
