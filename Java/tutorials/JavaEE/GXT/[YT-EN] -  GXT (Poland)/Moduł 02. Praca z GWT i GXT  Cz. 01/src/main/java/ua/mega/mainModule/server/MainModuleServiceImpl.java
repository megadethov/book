package ua.mega.mainModule.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.mega.mainModule.client.MainModuleService;

public class MainModuleServiceImpl extends RemoteServiceServlet implements MainModuleService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}