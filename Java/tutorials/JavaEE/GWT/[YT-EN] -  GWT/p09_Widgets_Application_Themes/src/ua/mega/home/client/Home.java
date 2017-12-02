package ua.mega.home.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {

    DatePicker dp;

    public void onModuleLoad() {

        dp = new DatePicker();

        RootPanel.get().add(dp);
    }
}
