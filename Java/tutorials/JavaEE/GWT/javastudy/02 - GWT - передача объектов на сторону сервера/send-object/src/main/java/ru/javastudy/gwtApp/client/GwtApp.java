package ru.javastudy.gwtApp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.*;
import ru.javastudy.gwtApp.client.objects.User;
import ru.javastudy.gwtApp.client.objects.UserResult;
import ru.javastudy.gwtApp.shared.FieldValidator;

/** Entry point classes define <code>onModuleLoad()</code>. */
public class GwtApp implements EntryPoint {

    final Button confirmButton = new Button("Confirm");
    final TextBox nameField = new TextBox();
    final TextBox passField = new TextBox();
    final Label errorLabel = new Label();
    final Label helloLabel = new Label();

    VerticalPanel dialogVPanel = new VerticalPanel();
    final DialogBox dialogBox = new DialogBox();
    final HTML serverResponseHtml = new HTML();
    final Label sendToServerLabel = new Label();
    final Button closeButton = new Button("Close");

    private final GwtAppServiceIntfAsync gwtAppService = GWT.create(GwtAppServiceIntf.class);

    /** This is the entry point method.*/
    public void onModuleLoad() {

        helloLabel.setText("GwtApp Application hello world");

        final Label usernameLabel = new Label();
        final Label passwordLabel = new Label();
        usernameLabel.setText("Username: ");
        passwordLabel.setText("Password: ");
        /*Связываем id='' на html странице с компонентами */
        RootPanel.get("helloId").add(helloLabel);

        RootPanel.get("usernameLabelId").add(usernameLabel);
        RootPanel.get("usernameId").add(nameField);

        RootPanel.get("passLabelId").add(passwordLabel);
        RootPanel.get("passId").add(passField);

        RootPanel.get("confirmButtonId").add(confirmButton);
        RootPanel.get("errorLabelContainer").add(errorLabel);

        // Create the popup dialog box
        dialogBox.setText("Remote procedure call from server");
        dialogBox.setAnimationEnabled(true);

        closeButton.getElement().setId("closeButtonId");

        dialogVPanel.addStyleName("dialogVPanel");
        dialogVPanel.add(new HTML("<b>Отправленные поля на сервер:</b>"));
        dialogVPanel.add(sendToServerLabel);
        dialogVPanel.add(new HTML("<br><b>Ответ сервера:</b>"));
        dialogVPanel.add(serverResponseHtml);
        dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
        dialogVPanel.add(closeButton);
        dialogBox.setWidget(dialogVPanel);

        //обработчик для клика по кнопке 'Confirm'
        confirmButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                confirmButton.setEnabled(false);
                sendInfoToServer();
            }
        });

        //обработчик по нажатию enter в текстовом поле
        nameField.addKeyUpHandler(new KeyUpHandler() {
            public void onKeyUp(KeyUpEvent event) {
                if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                    sendInfoToServer();
                }
            }
        });
        passField.addKeyUpHandler(new KeyUpHandler() {
            public void onKeyUp(KeyUpEvent event) {
                if(event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                    sendInfoToServer();
                }
            }
        });
        //обработчик по клику на кнопку 'Close' в диалоговом окне
        closeButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                dialogBox.hide();
                confirmButton.setEnabled(true);
                confirmButton.setFocus(true);
            }
        });

    }

    private void sendInfoToServer() {
        //validate input text
        errorLabel.setText("");
        User user = new User();

        user.setName(nameField.getText());
        user.setPassword(passField.getText());

        //отобразить ошибку на html странице
        if (!FieldValidator.isValidData(user.getName()) || !FieldValidator.isValidData(user.getPassword())) {
            errorLabel.setText("Поле должно содержать больше трех символов");
            confirmButton.setEnabled(true);
            return;
        }
        confirmButton.setEnabled(false);
        sendToServerLabel.setText("username: " + user.getName()+ " password: " + user.getPassword());
        serverResponseHtml.setText("");
        gwtAppService.gwtAppCallServer(user, new AsyncCallback<UserResult>() {
            public void onFailure(Throwable caught) {
                dialogBox.setText("Remote Procedure Call - Failure");
                serverResponseHtml.addStyleName("serverResponseLabelError");
                serverResponseHtml.setHTML("ERROR ON SERVER");
                dialogBox.center();
                closeButton.setFocus(true);
            }
            public void onSuccess(UserResult result) {
                dialogBox.setText("Remote Procedure Call");
                serverResponseHtml.removeStyleName("serverResponseLabelError");
                serverResponseHtml.setHTML("username: " + result.getName()+ "<br>password: " + result.getPassword());
                dialogBox.center();
                closeButton.setFocus(true);
            }
        });

    }

}
