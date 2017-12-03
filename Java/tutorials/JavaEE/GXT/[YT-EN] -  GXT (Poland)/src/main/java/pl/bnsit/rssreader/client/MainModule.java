package pl.bnsit.rssreader.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class MainModule implements EntryPoint {
    public void onModuleLoad() {
        Label label = new Label("Test Entry Point");
        RootPanel.get().add(label);
    }
}
