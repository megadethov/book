package ua.mega.guibuilding.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class GuiBuilding implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        MyWidget myWidget = new MyWidget();

        RootPanel.get().add(myWidget);
    }
}
