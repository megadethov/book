package ua.mega.rpcproject.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import ua.mega.rpcproject.client.service.ExampleServiceClientImpl;

public class MainGUI extends Composite {

    private VerticalPanel vPanel = new VerticalPanel();
    private TextBox txt1;
    private Label resultLbl;

    private TextBox txtNum1;
    private TextBox txtNum2;
    private Label sumLbl;

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

        // add 2 nums
        this.txtNum1 = new TextBox();
        this.vPanel.add(txtNum1);

        this.txtNum2 = new TextBox();
        this.vPanel.add(txtNum2);

        Button btn2 = new Button("Add two numbers");
        btn2.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                int num1 = Integer.valueOf(txtNum1.getText());
                int num2 = Integer.valueOf(txtNum2.getText());

                serviceImpl.addTwoNums(num1, num2);
            }
        });
        this.vPanel.add(btn2);

        this.sumLbl = new Label("Sum will be here");
        this.vPanel.add(sumLbl);

    }

    public void updateLabel (String greeting){
        this.resultLbl.setText(greeting);
    }
    public void updateSumLabel (int sum){
        this.sumLbl.setText("" + sum);
    }
}
