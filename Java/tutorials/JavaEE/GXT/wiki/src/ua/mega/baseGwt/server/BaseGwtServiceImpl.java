package ua.mega.baseGwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.mega.baseGwt.client.BaseGwtService;

public class BaseGwtServiceImpl extends RemoteServiceServlet implements BaseGwtService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}