package ua.mega.rpcproject.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ua.mega.rpcproject.client.service.ExampleService;

public class ExampleServiceImpl extends RemoteServiceServlet implements ExampleService {

    @Override
    public String sayHello(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    @Override
    public int addTwoNums(int a, int b) {
        int sum = a + b;
        return sum;
    }
}