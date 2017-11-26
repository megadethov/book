package ua.mega.rpcproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import ua.mega.rpcproject.client.service.ExampleService;
import ua.mega.rpcproject.client.service.ExampleServiceClient;
import ua.mega.rpcproject.client.service.ExampleServiceClientImpl;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class RPC_Project implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        ExampleServiceClientImpl clientImpl = new ExampleServiceClientImpl(GWT.getModuleBaseURL() + "exampleservice");
        RootPanel.get().add(clientImpl.getMainGUI());
    }
}
