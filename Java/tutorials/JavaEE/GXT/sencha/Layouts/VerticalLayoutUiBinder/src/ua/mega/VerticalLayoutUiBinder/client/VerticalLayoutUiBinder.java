package ua.mega.VerticalLayoutUiBinder.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.sencha.gxt.core.client.resources.ThemeStyles;

public class VerticalLayoutUiBinder implements IsWidget, EntryPoint {
    private static MyUiBinder uiBinder = GWT.create(VerticalLayoutUiBinder.class);

    interface MyUiBinder extends UiBinder<Widget, VerticalLayoutUiBinder> {
    }

/*    @UiField(provided = true)
    ThemeStyles.Styles themeStyles = ThemeStyles.get().style();*/

    private Widget widget;

    public Widget asWidget() {
        if (widget == null) {
            widget = uiBinder.createAndBindUi(this);
        }

        return widget;
    }

    public void onModuleLoad() {
        RootPanel.get().add(asWidget());
    }
}