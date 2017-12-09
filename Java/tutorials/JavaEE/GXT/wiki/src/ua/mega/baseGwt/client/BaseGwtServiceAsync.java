package ua.mega.baseGwt.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BaseGwtServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
