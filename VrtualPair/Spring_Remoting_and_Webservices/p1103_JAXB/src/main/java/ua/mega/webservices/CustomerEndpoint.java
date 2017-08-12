package ua.mega.webservices;

import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.*;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

import javax.annotation.Resource;
import java.io.IOException;

@Endpoint
public class CustomerEndpoint {

    public static final String NAMESPACE = "http://www.mega.ua/crm";

    @Resource(name = "customerService")
    CustomerManagementService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "getCustomerByIdRequest")
//    @org.springframework.ws.server.endpoint.annotation.Namespace(prefix = "mega", uri = NAMESPACE)
    @ResponsePayload
//    public Element fetchTheCustomerDetailsJDomVersion(@XPathParam("/mega:getCustomerByIdRequest/id") String id, @RequestPayload Element incoming) throws CustomerNotFoundException {
    public Element fetchTheCustomerDetailsJDomVersion(@XPathParam("//id") String id, @RequestPayload Element incoming) throws CustomerNotFoundException {

/*        try {
            new XMLOutputter(Format.getPrettyFormat()).output(incoming, System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Customer found = service.findCustomerById(id);

        Element outgoing = new Element("getCustomerByIdResponse");
        outgoing.addNamespaceDeclaration(Namespace.getNamespace("tns", NAMESPACE));

        Element customer = new Element("customer");

        customer.addContent(new Element("customerId").setText(found.getCustomerId()));
        customer.addContent(new Element("companyName").setText(found.getCompanyName()));
        customer.addContent(new Element("email").setText(found.getEmail()));
        if (found.getNotes() != null) customer.addContent(new Element("notes").setText(found.getNotes()));
        if (found.getTelephone() != null) customer.addContent(new Element("phone").setText(found.getTelephone()));

        outgoing.addContent(customer);

        return outgoing;
    }
}
