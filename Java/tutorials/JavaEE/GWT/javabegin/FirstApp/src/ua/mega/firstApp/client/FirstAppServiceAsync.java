package ua.mega.firstApp.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FirstAppServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
