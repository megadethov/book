package ua.mega.VerticalLayoutUiBinder.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;

public class VerticalLayout implements IsWidget, EntryPoint {

    private FramedPanel panel;

    @Override
    public Widget asWidget() {
        if (panel == null) {
            panel = new FramedPanel();
//            panel.setHeadingText("VerticalLayout Example");
            panel.setHeading("VerticalLayout Example");
            panel.setPixelSize(400, 300);
            panel.setCollapsible(true);
            panel.getElement().setMargins(10);

            VerticalLayoutContainer c = new VerticalLayoutContainer();
            panel.setWidget(c);

            Label label1 = new Label("Test Label 1");
            label1.addStyleName(ThemeStyles.get().style().border());
            label1.addStyleName("pad-text white-bg");

            Label label2 = new Label("Test Label 2");
            label2.addStyleName(ThemeStyles.get().style().border());
            label2.addStyleName("pad-text white-bg");

            Label label3 = new Label("Test Label 3");
            label3.addStyleName(ThemeStyles.get().style().border());
            label3.addStyleName("pad-text white-bg");

            c.add(label1, new VerticalLayoutContainer.VerticalLayoutData(1, .5d, new Margins(4)));
            c.add(label2, new VerticalLayoutData(1, -200, new Margins(0, 4, 0, 4)));
            c.add(label3, new VerticalLayoutData(1, .5d, new Margins(4)));
        }
        return panel;
    }

    public void onModuleLoad() {
        RootPanel.get().add(asWidget());
    }
}
