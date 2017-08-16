import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

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

        String response = template.getForObject("http://localhost:8080/mywebapp/customer/102", String.class);
        System.out.println(response);

        Customer customer = template.getForObject("http://localhost:8080/mywebapp/customer/102", Customer.class);
        System.out.println(customer.getCustomerId());

    }
}
