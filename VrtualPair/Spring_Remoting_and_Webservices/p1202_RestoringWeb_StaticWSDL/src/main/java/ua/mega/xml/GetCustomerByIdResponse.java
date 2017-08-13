
package ua.mega.xml;

import ua.mega.domain.Customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://www.mega.ua/crm}customer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customer"
})
@XmlRootElement(name = "getCustomerByIdResponse", namespace = "http://www.mega.ua/crm")
public class GetCustomerByIdResponse {

    @XmlElement(required = true)
    protected CustomerXML customer;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerXML }
     *     
     */
    public CustomerXML getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerXML }
     *     
     */
    public void setCustomer(CustomerXML value) {
        this.customer = value;
    }

    public GetCustomerByIdResponse() {
    }

    public GetCustomerByIdResponse(Customer customerDomain) {
        this.customer = new CustomerXML();
        customer.setCustomerId(customerDomain.getCustomerId());
        customer.setCompanyName(customerDomain.getCompanyName());
        customer.setEmail(customerDomain.getEmail());
    }
}
