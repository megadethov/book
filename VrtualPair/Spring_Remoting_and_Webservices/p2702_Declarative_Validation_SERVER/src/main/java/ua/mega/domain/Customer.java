package ua.mega.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Represents a customer in the CRM system.
 * <p/>
 * Note that this is just a starting point - you are free to expand and
 * modify this class!
 *
 * @author Richard Chesterwood
 */
@Entity
@XmlRootElement
public class Customer extends ResourceSupport implements Serializable {
    /**
     * A simple unique value for the customer - note this is determined
     * by the business and is not necessarily the database primary key.
     */
    @Id
    private String customerId;

    /**
     * The company name
     */
    @NotEmpty
    private String companyName;

    /**
     * The contact's email address
     */
    private String email;

    /**
     * The contact's telephone number
     */
    private String telephone;

    /**
     * Any notes associated with this customer
     */
    @NotEmpty
    private String notes;

    /**
     * References to any Calls this customer has made
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Call> calls;

//    @Version
    private int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * Constructor - id, notes and name are required
     */
    public Customer(String customerId, String companyName, String email,
                    String telephone, String notes) {
        this(customerId, companyName, notes);
        this.email = email;
        this.telephone = telephone;
    }

    /**
     * Constructor - email and telephone are optional
     */
    public Customer(String customerId, String companyName, String notes) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.notes = notes;
        this.calls = new ArrayList<Call>();
    }

    /**
     * Add a new call for this customer
     */
    public void addCall(Call callDetails) {
        this.calls.add(callDetails);
    }

    /**
     * A Simple toString implementation
     */
    public String toString() {
        return this.customerId + ": " + this.companyName;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNotes() {
        return notes;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setCalls(List<Call> calls) {
        this.calls = calls;
    }

    // needed for JPA - ignore until then
    public Customer() {
    }
}
