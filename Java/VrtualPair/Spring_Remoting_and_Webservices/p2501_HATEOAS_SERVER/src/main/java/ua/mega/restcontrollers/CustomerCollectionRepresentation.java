package ua.mega.restcontrollers;

import ua.mega.domain.Customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="customers")
public class CustomerCollectionRepresentation {

    private List<Customer> customers;

    public CustomerCollectionRepresentation() {
    }

    public CustomerCollectionRepresentation(List<Customer> customers) {
        this.customers = customers;
    }

    @XmlElement(name="customer")
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
