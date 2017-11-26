package ua.mega.rpcproject.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.mega.rpcproject.client.service.ExampleService;

public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService {

    @Override
    public String sayHello(String name) {
        return null;
    }

    @Override
    public int addTwoNums(int a, int b) {
        return 0;
    }
}