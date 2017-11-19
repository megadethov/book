package ua.mega.firstApp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.mega.firstApp.client.FirstAppService;

public class FirstAppServiceImpl extends RemoteServiceServlet implements FirstAppService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}