package ua.mega.webservices;

import ua.mega.domain.Call;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "customerService")
public class CustomerEndpoint implements CustomerManagementService {

    CustomerManagementService service;

    @WebMethod(exclude = true)
    public void setService(CustomerManagementService service) {
        this.service = service;
    }

    @Override
    public void newCustomer(Customer newCustomer) {
        service.newCustomer(newCustomer);
    }

    @Override
    public void updateCustomer(Customer changedCustomer) throws CustomerNotFoundException {
        service.updateCustomer(changedCustomer);
    }

    @Override
    public void deleteCustomer(Customer oldCustomer) throws CustomerNotFoundException {
        deleteCustomer(oldCustomer);
    }

    @Override
    public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
        return service.findCustomerById(customerId);
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        return service.findCustomersByName(name);
    }

    @Override
    public List<Customer> getAllCustomers() {
       /* List<Customer> allCustomers = service.getAllCustomers();
        for (Customer next : allCustomers) {
            next.setCalls(null);
        }
        return allCustomers;*/
        return new ArrayList<>();
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
        return service.getFullCustomerDetail(customerId);
    }

    @Override
    public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
        service.recordCall(customerId, callDetails);
    }
}
