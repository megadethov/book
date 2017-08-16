import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RestClient {
    public static void main(String[] args) throws IOException {

        //IO approach
/*        URL url = new URL("http://localhost:8080/mywebapp/customer/102");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        br.close();*/

        RestTemplate template = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
        acceptableMediaTypes.add(MediaType.IMAGE_JPEG);
//        acceptableMediaTypes.add(MediaType.APPLICATION_XML);
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
        headers.setAccept(acceptableMediaTypes);

        HttpEntity requestEntity = new HttpEntity(headers);

        HttpEntity response = template.exchange("http://localhost:8080/mywebapp/customer/102", HttpMethod.GET, requestEntity, String.class);
        System.out.println(response);

        Customer customer = template.getForObject("http://localhost:8080/mywebapp/customer/102", Customer.class);
        System.out.println(customer.getCustomerId());

    }
}
