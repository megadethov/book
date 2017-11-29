package ua.mega.rpcproject.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ua.mega.rpcproject.client.model.ImagesList;
import ua.mega.rpcproject.client.model.PersonalInfo;

public interface ExampleServiceClient {
    void sayHello(String name);

    void addTwoNums(int a, int b);

    // work with Object type
    void getPersonalInfo(String familyName);

    void getImages();
}
