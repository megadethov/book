package ua.mega.webservices;

import org.jdom2.Element;
import org.jdom2.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ua.mega.domain.User;
import ua.mega.services.UserManagementService;
import ua.mega.services.UserNotFound;

@Endpoint
public class UserEndpoint {

    public static final String NAMESPACE = "http://www.mega.ua/urm";

    @Autowired
    UserManagementService service;

    @PayloadRoot(namespace = NAMESPACE, localPart = "getUserByIdRequest")
    @ResponsePayload
    public Element fetchTheUserDetailsJDomVersion(@RequestPayload Element incoming) throws UserNotFound {
        Element idElement = incoming.getChild("id");
        String id = idElement.getText();

        User foundUser = service.getUserById(id);

        Element outgoing = new Element("getUserByIdResponse");
        outgoing.addNamespaceDeclaration(Namespace.getNamespace("tns", NAMESPACE));

        Element user = new Element("user");

        user.addContent(new Element("userId").setText(foundUser.getId()));
        user.addContent(new Element("userName").setText(foundUser.getName()));

        outgoing.addContent(user);

        return outgoing;
    }

}
