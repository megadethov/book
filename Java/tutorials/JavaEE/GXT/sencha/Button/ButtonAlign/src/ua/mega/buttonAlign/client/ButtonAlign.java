package ua.mega.buttonAlign.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutPack;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.info.Info;

public class ButtonAlign implements IsWidget, EntryPoint {

    protected static final int MIN_WIDTH = 300;

    private VerticalLayoutContainer panel;

    public Widget asWidget() {
        if (panel == null) {
            SelectHandler selectHandler = new SelectHandler() {
                @Override
                public void onSelect(SelectEvent event) {
                    Info.display("Click", ((TextButton) event.getSource()).getText() + " clicked");
                }
            };

            ContentPanel panelStart = new ContentPanel();
            // Align buttons to the start or left in ltr
            panelStart.setButtonAlign(BoxLayoutPack.START); // Left
            panelStart.setHeading("Button Aligning — " + BoxLayoutPack.START);
            panelStart.addButton(new TextButton("Button 1", selectHandler));
            panelStart.addButton(new TextButton("Button 2", selectHandler));
            panelStart.addButton(new TextButton("Button 3", selectHandler));

            ContentPanel panelCenter = new ContentPanel();
            // Align buttons to the center
            panelCenter.setButtonAlign(BoxLayoutPack.CENTER); // Center
            panelCenter.setHeading("Button Aligning — " + BoxLayoutPack.CENTER);
            panelCenter.addButton(new TextButton("Button 1", selectHandler));
            panelCenter.addButton(new TextButton("Button 2", selectHandler));
            panelCenter.addButton(new TextButton("Button 3", selectHandler));

            ContentPanel panelEnd = new ContentPanel();
            // Align buttons to the end or right in ltr
            panelEnd.setButtonAlign(BoxLayoutPack.END); // Right
            panelEnd.setHeading("Button Aligning — " + BoxLayoutPack.END);
            panelEnd.addButton(new TextButton("Button 1", selectHandler));
            panelEnd.addButton(new TextButton("Button 2", selectHandler));
            panelEnd.addButton(new TextButton("Button 3", selectHandler));

            panel = new VerticalLayoutContainer();
            panel.add(panelStart, new VerticalLayoutData(1, 0.33333));
            panel.add(new HTML(), new VerticalLayoutData(1, -1, new Margins(20, 0, 0, 0)));
            panel.add(panelCenter, new VerticalLayoutData(1, 0.33333));
            panel.add(new HTML(), new VerticalLayoutData(1, -1, new Margins(20, 0, 0, 0)));
            panel.add(panelEnd, new VerticalLayoutData(1, 0.33333));
        }

        return panel;
    }

    @Override
    public void onModuleLoad() {
        asWidget();
        panel.setWidth(MIN_WIDTH);
        RootPanel.get().add(panel);
    }
}
