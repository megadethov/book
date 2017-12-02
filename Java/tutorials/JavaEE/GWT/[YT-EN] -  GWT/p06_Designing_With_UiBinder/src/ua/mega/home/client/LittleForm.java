package ua.mega.home.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class LittleForm extends Composite {
    interface LittleElementUiBinder extends UiBinder<HTMLPanel, LittleForm> {
    }

    private static LittleElementUiBinder ourUiBinder = GWT.create(LittleElementUiBinder.class);

    public LittleForm() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    // Bad style - use ui.xml
/*   public void setText(String text) {
        // set text
    }*/
}