import ua.mega.crm.*;

public class Main {
    public static void main(String[] args) {

        CustomerService service = new CustomerServiceService().getCustomerServiceSoap11();

        GetCustomerByIdRequest getCustomerByIdRequest = new GetCustomerByIdRequest();
        getCustomerByIdRequest.setId("777");

        GetCustomerByIdResponse response = service.getCustomerById(getCustomerByIdRequest);
        System.out.println(response.getCustomer().getCompanyName());
        System.out.println(response.getCustomer().getEmail());
        System.out.println(response.getCustomer().getPhone());

    }
}
