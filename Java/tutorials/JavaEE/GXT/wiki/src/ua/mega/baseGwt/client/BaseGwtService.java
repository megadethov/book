package ua.mega.baseGwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("BaseGwtService")
public interface BaseGwtService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use BaseGwtService.App.getInstance() to access static instance of BaseGwtServiceAsync
     */
    public static class App {
        private static BaseGwtServiceAsync ourInstance = GWT.create(BaseGwtService.class);

        public static synchronized BaseGwtServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
