package ua.mega.mainModule.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MainModuleServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
