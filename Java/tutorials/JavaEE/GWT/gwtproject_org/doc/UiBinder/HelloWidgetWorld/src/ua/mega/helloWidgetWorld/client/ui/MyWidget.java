package ua.mega.helloWidgetWorld.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ListBox;

public class MyWidget extends Composite {
    interface MyWidgetUiBinder extends UiBinder<HTMLPanel, MyWidget> {
    }

    private static MyWidgetUiBinder ourUiBinder = GWT.create(MyWidgetUiBinder.class);

    @UiField
    ListBox listBox;

    public MyWidget(String... names) {
        // sets listBox
        initWidget(ourUiBinder.createAndBindUi(this));
        for (String name : names) {
            listBox.addItem(name);
        }
    }
}