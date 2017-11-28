package ua.mega.rpcproject.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ExampleServiceAsync {

    // асинхронный всегда - void
    void sayHello(String name, AsyncCallback<String> async);

    void addTwoNums(int a, int b, AsyncCallback<Integer> async);
}
