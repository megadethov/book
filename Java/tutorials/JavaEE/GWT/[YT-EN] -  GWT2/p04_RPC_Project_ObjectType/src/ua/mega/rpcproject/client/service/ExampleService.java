package ua.mega.rpcproject.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ua.mega.rpcproject.client.model.ImagesList;
import ua.mega.rpcproject.client.model.PersonalInfo;

@RemoteServiceRelativePath("exampleservice")
public interface ExampleService extends RemoteService {
    String sayHello(String name);

    int addTwoNums(int a, int b);

    // work with Object type
    PersonalInfo getPersonalInfo(String familyName);

    ImagesList getImages();
}
