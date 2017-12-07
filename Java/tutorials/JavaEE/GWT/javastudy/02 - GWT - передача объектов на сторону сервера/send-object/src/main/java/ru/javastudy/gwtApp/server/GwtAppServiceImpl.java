package ru.javastudy.gwtApp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ru.javastudy.gwtApp.client.GwtAppServiceIntf;
import ru.javastudy.gwtApp.client.objects.User;
import ru.javastudy.gwtApp.client.objects.UserResult;
import ru.javastudy.gwtApp.shared.FieldValidator;

/**
 * The server-side implementation of the RPC service.
 */
public class GwtAppServiceImpl extends RemoteServiceServlet implements GwtAppServiceIntf {

    public UserResult gwtAppCallServer(User user) throws IllegalArgumentException {
        if (!FieldValidator.isValidData(user.getName()) || !FieldValidator.isValidData(user.getPassword())) {
           throw new IllegalArgumentException("Имя должно быть больше трех символов");
        }

        UserResult userResult = new UserResult();
        userResult.setName(user.getName() + " server reply");
        userResult.setPassword(user.getPassword() + " server reply");

        return userResult;
    }
}
