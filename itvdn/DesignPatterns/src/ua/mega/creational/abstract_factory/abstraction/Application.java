package ua.mega.creational.abstract_factory.abstraction;

import ua.mega.creational.abstract_factory.implementation.CocaColaFactory;
import ua.mega.creational.abstract_factory.implementation.PepsiColaFactory;

public class Application {
    public static void main(String[] args) {
        Client client = new Client(new CocaColaFactory());
//        if(client != null)
        client.run();
    }
}
