package ua.mega.baseGwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.box.AlertMessageBox;
import com.sencha.gxt.widget.core.client.box.MessageBox;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class BaseGwt implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        TextButton b = new TextButton("Нажми меня...");
        b.addSelectHandler(new SelectHandler() {

            @Override
            public void onSelect(SelectEvent event) {
                AlertMessageBox d = new AlertMessageBox("Нажата кнопка", "Вы нажали кнопку");
                d.setIcon(MessageBox.ICONS.info());
                d.show();
            }
        });
        RootPanel.get().add(b);
    }
}
