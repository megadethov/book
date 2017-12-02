package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {

    private MenuBar menu;

    public void onModuleLoad() {

        menu = new MenuBar();
        Command cmd = new Command() {
            @Override
            public void execute() {
                Window.alert("Clicked");
            }
        };
        menu.addItem(new MenuItem("File", cmd));

        RootPanel.get().add(menu);
    }
}
