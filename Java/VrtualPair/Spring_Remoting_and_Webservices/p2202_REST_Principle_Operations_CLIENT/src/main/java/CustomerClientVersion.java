import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "customer")
public class CustomerClientVersion {
    private String customerId;
    private String companyName;
    private String email;
    private String notes;
    private String telephone;
    private List<CallClientVersion> calls;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "customer{" + getCompanyName() + "}";
    }
}
