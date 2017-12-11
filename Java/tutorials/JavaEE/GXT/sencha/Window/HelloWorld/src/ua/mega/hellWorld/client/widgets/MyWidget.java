package ua.mega.hellWorld.client.widgets;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Rectangle;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.ButtonBar;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.HideEvent;
import com.sencha.gxt.widget.core.client.event.HideEvent.HideHandler;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class MyWidget implements IsWidget {

    protected static final int MIN_WIDTH = 88;
    protected static final int PREFERRED_HEIGHT = -1;

    private ButtonBar buttonBar;
    private Window window;

    @Override
    public Widget asWidget() {
        if (buttonBar == null) {
            Label label1 = new Label("Hello...");
//            label1.addStyleName("pad-text");

            Label label2 = new Label("World...");
//            label2.addStyleName("pad-text");

            TextButton buttonClose = new TextButton("Close");
            buttonClose.addSelectHandler(new SelectHandler() {
                @Override
                public void onSelect(SelectEvent event) {
                    window.hide();
                }
            });

            TextButton buttonHelloWorld = new TextButton("Hello World");
            buttonHelloWorld.addSelectHandler(new SelectHandler() {
                @Override
                public void onSelect(SelectEvent event) {
                    // show the window
                    window.show();

                    // constrain the window to the viewport (for small mobile screen sizes)
                    Rectangle bounds = window.getElement().getBounds();
                    Rectangle adjusted = window.getElement().adjustForConstraints(bounds);
                    if (adjusted.getWidth() != bounds.getWidth() || adjusted.getHeight() != bounds.getHeight()) {
                        window.setPixelSize(adjusted.getWidth(), adjusted.getHeight());
                    }
                }
            });

            TabPanel panel = new TabPanel();
            panel.setBorders(false);
            panel.add(label1, new TabItemConfig("Hello World 1"));
            panel.add(label2, new TabItemConfig("Hello World 2"));

            window = new Window();
            window.setPixelSize(640, 480);
            window.setResizable(false);
            window.setModal(true);
            window.setBlinkModal(true);
            window.setHeading("Hello World");
            window.add(panel);
            window.addButton(buttonClose);
            window.setFocusWidget(window.getButtonBar().getWidget(0));
            window.setData("open", buttonHelloWorld);
            window.addHideHandler(new HideHandler() {
                @Override
                public void onHide(HideEvent event) {
                    TextButton open = ((Window) event.getSource()).getData("open");
                    open.focus();
                }
            });

            buttonBar = new ButtonBar();
            buttonBar.add(buttonHelloWorld);
        }

        buttonBar.setWidth(MIN_WIDTH);
        buttonBar.setHeight(PREFERRED_HEIGHT);
        return buttonBar;
    }
}
