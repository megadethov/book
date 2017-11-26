package ua.mega.rpcproject.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import ua.mega.rpcproject.client.service.ExampleServiceClientImpl;

public class MainGUI extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();
    private TextBox txt1;
    private Label resultLbl;

    ExampleServiceClientImpl serviceImpl;

    public MainGUI(ExampleServiceClientImpl serviceImpl) {
        initWidget(this.vPanel);
        this.serviceImpl = serviceImpl;

        this.txt1 = new TextBox();
        this.vPanel.add(txt1);

        Button btn1 = new Button("Say Hello");
        btn1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                String name = txt1.getText();
               serviceImpl.sayHello(name);
            }
        });
        this.vPanel.add(btn1);

        this.resultLbl = new Label("Result will be here");
        this.vPanel.add(resultLbl);
    }

    public void updateLabel (String greeting){
        this.resultLbl.setText(greeting);
    }
}
