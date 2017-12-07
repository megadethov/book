package ru.javastudy.gwtApp.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ru.javastudy.gwtApp.client.objects.User;
import ru.javastudy.gwtApp.client.objects.UserResult;

/**
 * The async counterpart of <code>GwtAppServiceIntf</code>
 */
public interface GwtAppServiceIntfAsync {
    void gwtAppCallServer(User data, AsyncCallback<UserResult> callback) throws IllegalArgumentException;
}
