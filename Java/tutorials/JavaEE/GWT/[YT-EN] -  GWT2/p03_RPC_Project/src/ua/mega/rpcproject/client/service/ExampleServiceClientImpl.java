package ua.mega.rpcproject.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import ua.mega.rpcproject.client.gui.MainGUI;

public class ExampleServiceClientImpl implements ExampleServiceClient {

    private ExampleServiceAsync service;
    private MainGUI mainGUI;

    public ExampleServiceClientImpl(String url) {
        System.out.println(url);
        this.service = GWT.create(ExampleService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
        endpoint.setServiceEntryPoint(url);

        this.mainGUI = new MainGUI(this);
    }

    @Override
    public void sayHello(String name) {
        service.sayHello(name, new DefaultCallback());
    }

    @Override
    public void addTwoNums(int a, int b) {
        service.addTwoNums(a, b, new DefaultCallback());
    }

    public MainGUI getMainGUI() {
        return this.mainGUI;
    }

    private class DefaultCallback implements AsyncCallback {

        @Override
        public void onFailure(Throwable caught) {
            System.out.println("An Error has occurred");
        }

        @Override
        public void onSuccess(Object result) {
            if (result instanceof String) {
                String greeting = (String) result;
                mainGUI.updateLabel(greeting);
            }
        }
    }
}
