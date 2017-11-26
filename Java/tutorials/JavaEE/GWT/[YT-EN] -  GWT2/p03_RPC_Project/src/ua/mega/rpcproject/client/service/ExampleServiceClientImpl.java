package ua.mega.rpcproject.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ExampleServiceClientImpl implements ExampleServiceClient {

    private ExampleServiceAsync service;

    public ExampleServiceClientImpl(String url) {
        this.service = GWT.create(ExampleService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
        endpoint.setServiceEntryPoint(url);
    }

    @Override
    public void sayHello(String name) {
        service.sayHello(name, new DefaultCallback());
    }

    @Override
    public void addTwoNums(int a, int b) {
        service.addTwoNums(a, b, new DefaultCallback());
    }

    private class DefaultCallback implements AsyncCallback {

        @Override
        public void onFailure(Throwable caught) {
            System.out.println("An Error has occurred");
        }

        @Override
        public void onSuccess(Object result) {
            System.out.println("Response received");
        }
    }
}
