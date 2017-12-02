package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Home implements EntryPoint {

    private LittleForm form = new LittleForm();

    public void onModuleLoad() {
//        form.setText("New Text");  // Bad style - use ui.xml
        RootPanel.get().add(form);
    }
}
