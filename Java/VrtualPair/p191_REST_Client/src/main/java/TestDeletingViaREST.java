import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.Response;

public class TestDeletingViaREST {
    public static void main(String[] args) {
        Client client = Client.create();
        WebResource web = client.resource("http://localhost:8080/webapp/webservice/employees/451");

       ClientResponse response = web.delete(ClientResponse.class);

        if (response.getStatus() == 404)
        {
            System.out.println("Sorry, that employee resource didn't exist");
        }
    }
}
