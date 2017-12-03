package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;
import ua.mega.home.shared.Person;

public class Home implements EntryPoint {

    public void onModuleLoad() {

        Person person = new Person();

        Label lbl = new Label("Hello! My name is " + person.getFirstName() + " " + person.getLastName());

        RootPanel.get().add(lbl);
    }
}
