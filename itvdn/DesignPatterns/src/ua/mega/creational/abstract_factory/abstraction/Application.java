package ua.mega.creational.abstract_factory.abstraction;

import ua.mega.creational.abstract_factory.implementation.CocaColaFactory;

public class Application {
    public static void main(String[] args) {
        Client client = new Client(new CocaColaFactory());
//        if(client != null)
        client.run();
    }
}
