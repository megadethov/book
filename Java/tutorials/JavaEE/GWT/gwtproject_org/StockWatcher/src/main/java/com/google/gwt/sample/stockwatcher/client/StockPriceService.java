package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;

@RemoteServiceRelativePath("stockPrices")
public interface StockPriceService extends RemoteService {
    /**
     * Utility/Convenience class.
     * Use StockPriceService.App.getInstance() to access static instance of GreetingServiceAsync
     */
    public static class App {
        private static final StockPriceServiceAsync ourInstance = (StockPriceServiceAsync) GWT.create(StockPriceService.class);

        public static StockPriceServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
