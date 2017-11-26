package ua.mega.rpcproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import ua.mega.rpcproject.client.service.ExampleService;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class RPC_Project implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        RootPanel.get().add(new Label("Hello from Entry Point"));
    }
}
