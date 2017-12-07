package ru.javastudy.gwtApp.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ru.javastudy.gwtApp.client.objects.User;
import ru.javastudy.gwtApp.client.objects.UserResult;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("gwtAppService")
public interface GwtAppServiceIntf extends RemoteService {
    UserResult gwtAppCallServer(User data) throws IllegalArgumentException;
}
