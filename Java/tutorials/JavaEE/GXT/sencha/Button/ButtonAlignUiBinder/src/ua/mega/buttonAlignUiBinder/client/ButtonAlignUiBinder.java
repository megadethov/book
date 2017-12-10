package ua.mega.buttonAlignUiBinder.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import ua.mega.buttonAlignUiBinder.client.ui.MyWidget;

public class ButtonAlignUiBinder implements EntryPoint {

    @Override
    public void onModuleLoad() {
        MyWidget myWidget = new MyWidget();
        RootPanel.get().add(myWidget);
    }
}
