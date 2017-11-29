package ua.mega.rpcproject.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ua.mega.rpcproject.client.model.ImagesList;
import ua.mega.rpcproject.client.model.PersonalInfo;

public interface ExampleServiceAsync {

    void sayHello(String name, AsyncCallback<String> async);

    void addTwoNums(int a, int b, AsyncCallback<Integer> async);

    // work with Object type
    void getPersonalInfo(String familyName, AsyncCallback<PersonalInfo> async);

    void getImages(AsyncCallback<ImagesList> async);
}
