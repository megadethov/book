package ua.mega.home.client.views;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import ua.mega.home.client.presenters.PersonPresenter;

public class PersonView extends Composite implements PersonPresenter.Display {

    private PersonPresenter presenter;

    interface PersonViewUiBinder extends UiBinder<Widget, PersonView> {
    }

    private static PersonViewUiBinder ourUiBinder = GWT.create(PersonViewUiBinder.class);

    public PersonView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @UiField
    Button button;
    @UiField
    Label name;

    @UiHandler("button")
    public void onClick(ClickEvent event) {
        Window.alert("Hello");
    }

    @Override
    public void clear() {
        name.setText("");
    }

    @Override
    public void setName(String name) {
        this.name.setText(name);
    }

    @Override
    public void setPresenter(PersonPresenter presenter) {
        this.presenter = presenter;
    }
}