package ua.mega.helloWorld.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

public class MyElement {
    interface MyElementUiBinder extends UiBinder<DivElement, MyElement> {
    }

    private static MyElementUiBinder ourUiBinder = GWT.create(MyElementUiBinder.class);

/*    public MyElement() {
        DivElement rootElement = ourUiBinder.createAndBindUi(this);
    }*/

    @UiField
    SpanElement nameSpan;

    private DivElement root;

    public MyElement() {
        root = ourUiBinder.createAndBindUi(this);
    }

    public Element getElement() {
        return root;
    }

    public void setName(String name) {
        nameSpan.setInnerText(name);
    }
}
