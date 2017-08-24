import org.springframework.hateoas.ResourceSupport;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="customers")
public class CustomerCollectionRepresentation extends ResourceSupport {

    private List<CustomerClientVersion> customers;

    public CustomerCollectionRepresentation() {
    }

    public CustomerCollectionRepresentation(List<CustomerClientVersion> customers) {
        this.customers = customers;
    }

    @XmlElement(name="customer")
    public List<CustomerClientVersion> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerClientVersion> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return customers.toString();
    }
}
