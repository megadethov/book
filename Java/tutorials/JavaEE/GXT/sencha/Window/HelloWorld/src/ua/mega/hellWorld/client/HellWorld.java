package ua.mega.hellWorld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import ua.mega.hellWorld.client.widgets.MyWidget;

public class HellWorld implements EntryPoint {

    public void onModuleLoad() {
        MyWidget myWidget = new MyWidget();
        RootPanel.get().add(myWidget);
    }
}
