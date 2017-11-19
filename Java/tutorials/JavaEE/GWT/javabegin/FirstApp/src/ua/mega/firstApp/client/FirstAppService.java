package ua.mega.firstApp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("FirstAppService")
public interface FirstAppService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use FirstAppService.App.getInstance() to access static instance of FirstAppServiceAsync
     */
    public static class App {
        private static FirstAppServiceAsync ourInstance = GWT.create(FirstAppService.class);

        public static synchronized FirstAppServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
