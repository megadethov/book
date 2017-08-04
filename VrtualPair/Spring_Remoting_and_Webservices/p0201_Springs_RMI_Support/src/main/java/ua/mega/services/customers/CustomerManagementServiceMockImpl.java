package ua.mega.services.customers;

import ua.mega.domain.Call;
import ua.mega.domain.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerManagementServiceMockImpl implements CustomerManagementService {

    private Map<String, Customer> customers;

    public CustomerManagementServiceMockImpl() {
        customers = new HashMap<>();
        customers.put("C2040", new Customer("C2040", "Disney", "Note-1"));
        customers.put("C2041", new Customer("C2041", "Home", "Note-2"));
        customers.put("C2042", new Customer("C2042", "Sclep", "Note-3"));
    }

    @Override
    public void newCustomer(Customer newCustomer) {
        this.customers.put(newCustomer.getCustomerId(), newCustomer);
    }

    @Override
    public void updateCustomer(Customer changedCustomer) {
        this.customers.put(changedCustomer.getCustomerId(), changedCustomer);
    }

    @Override
    public void deleteCustomer(Customer oldCustomer) {
        this.customers.remove(oldCustomer.getCustomerId());
    }

    @Override
    public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
        if (this.customers.get(customerId) == null) throw new CustomerNotFoundException();
        return this.customers.get(customerId);
    }

    @Override
    public List<Customer> findCustomersByName(String name) {
        ArrayList<Customer> foundCustomers = new ArrayList<>();
        for (Customer next : this.customers.values()) {
            if (next.getCompanyName().equals(name)) foundCustomers.add(next);
        }
        return foundCustomers;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(this.customers.values());
    }

    @Override
    public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
        return this.findCustomerById(customerId);
    }

    @Override
    public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
        Customer customer = this.getFullCustomerDetail(customerId);
        customer.addCall(callDetails);
    }
}
