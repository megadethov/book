package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import ua.mega.home.client.presenters.PersonPresenter;
import ua.mega.home.client.presenters.PersonPresenter.Display;
import ua.mega.home.client.presenters.Presenter;
import ua.mega.home.shared.Person;

public class Home implements EntryPoint {

    public void onModuleLoad() {

        Person person = new Person();
        Display view = null;
        Presenter presenter = new PersonPresenter(person, view);
        presenter.go(RootPanel.get());

    }
}
