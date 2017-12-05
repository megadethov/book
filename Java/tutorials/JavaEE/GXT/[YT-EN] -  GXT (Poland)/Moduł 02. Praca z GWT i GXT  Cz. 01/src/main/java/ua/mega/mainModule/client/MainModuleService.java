package ua.mega.mainModule.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("MainModuleService")
public interface MainModuleService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use MainModuleService.App.getInstance() to access static instance of MainModuleServiceAsync
     */
    public static class App {
        private static MainModuleServiceAsync ourInstance = GWT.create(MainModuleService.class);

        public static synchronized MainModuleServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
