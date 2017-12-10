package ua.mega.buttonAlignUiBinder.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.info.Info;

public class MyWidget implements IsWidget {

    @UiTemplate("MyWidget.ui.xml")
    interface MyWidgetUiBinder extends UiBinder<Widget, MyWidget> {
    }

    protected static final int MIN_WIDTH = 300;

    private static UiBinder<Widget, MyWidget> uiBinder;

    private Widget widget;

    @Override
    public Widget asWidget() {
        if (widget == null) {
            uiBinder = GWT.create(MyWidgetUiBinder.class);
        }
        widget = uiBinder.createAndBindUi(this);
        widget.setWidth(String.valueOf(MIN_WIDTH));
        return widget;
    }

    @UiHandler({"button1s", "button2s", "button3s", "button1c", "button2c", "button3c", "button1e", "button2e", "button3e"})
    public void onButtonClick(SelectEvent event) {
        Info.display("Click", ((TextButton) event.getSource()).getText() + " clicked");
    }
}