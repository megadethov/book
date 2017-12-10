package ua.mega.helloWidgetWorld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import ua.mega.helloWidgetWorld.client.ui.MyWidget;

public class HelloWidgetWorld implements EntryPoint {

    public void onModuleLoad() {
        MyWidget myWidget = new MyWidget("one", "two", "three");
        RootPanel.get().add(myWidget);
    }
}
