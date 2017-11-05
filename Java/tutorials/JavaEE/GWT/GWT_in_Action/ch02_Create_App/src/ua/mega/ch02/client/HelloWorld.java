package ua.mega.ch02.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class HelloWorld implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        Label theGreeting = new Label("Hello World!");
        RootPanel.get().add(theGreeting); // RootPanel - соответствует тегу body на странице
    }
}
