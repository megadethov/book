package ua.mega.webservices;

import org.jdom2.Element;
import org.jdom2.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

@Endpoint
public class CustomerEndpoint {

    @Autowired
    CustomerManagementService service;

    @PayloadRoot(namespace="http://www.mega.ua/crm", localPart="getCustomerByIdRequest")
    @ResponsePayload
    public Element fetchTheCustomerDetailsJDomVersion(@RequestPayload Element incoming) throws CustomerNotFoundException {
        Element idElement = incoming.getChild("id");
        String id = idElement.getText();

        Customer found = service.findCustomerById(id);

        Element outgoing = new Element("getCustomerByIdResponse");
        outgoing.addNamespaceDeclaration(Namespace.getNamespace("tns", "http://www.mega.ua/crm"));

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
