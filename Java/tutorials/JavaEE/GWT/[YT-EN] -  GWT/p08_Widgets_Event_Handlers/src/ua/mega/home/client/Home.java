package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Home implements EntryPoint {

    private Button btn;
    private Button btn2;

    public void onModuleLoad() {
//        btn = new Button("Click me!");
        btn = new Button("Click me!");
        btn2 = new Button("=')");

/*        btn.addMouseOverHandler(new MouseOverHandler() {
            @Override
            public void onMouseOver(MouseOverEvent event) {
                Window.alert("Mouse Over Event");
            }
        });*/

/*        btn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Button click Event");
            }
        });*/

        btn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                btn2.setText("='(");
            }
        });
        btn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                btn2.setText("=')");
            }
        });

        RootPanel.get().add(btn);
        RootPanel.get().add(btn2);
    }
}
