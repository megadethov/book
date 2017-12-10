package ua.mega.helloWorld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import ua.mega.helloWorld.client.ui.MyElement;

public class HelloWorld implements EntryPoint {

    public void onModuleLoad() {
        MyElement myElement = new MyElement();
// Don't forget, this is DOM only; will not work with GWT widgets
        Document.get().getBody().appendChild(myElement.getElement());
        myElement.setName("World");
    }
}
