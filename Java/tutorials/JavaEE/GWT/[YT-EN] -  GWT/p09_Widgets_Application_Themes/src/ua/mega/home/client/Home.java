package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {

    private MenuBar menu;

    public void onModuleLoad() {

        menu = new MenuBar(); // horizontal menu
//        menu = new MenuBar(true); // vertical menu
        Command cmd = new Command() {
            @Override
            public void execute() {
                Window.alert("Clicked");
            }
        };

        // add sub menu to the item - File
        MenuBar menuFile = new MenuBar(true);
        menuFile.addItem(new MenuItem("New", cmd));
        menuFile.addItem(new MenuItem("Open", cmd));
        menuFile.addItem(new MenuItem("Close", cmd));

        menu.addItem(new MenuItem("File", menuFile));
        menu.addItem(new MenuItem("Edit", cmd));
        menu.addItem(new MenuItem("Refactor", cmd));

        RootPanel.get().add(menu);
    }
}
