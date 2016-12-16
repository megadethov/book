package ua.mega.creational.abstract_factory.abstraction;

import ua.mega.creational.abstract_factory.implementation.SpriteFactory;

public class Application {
    public static void main(String[] args) {
        Client client = new Client(new SpriteFactory());
//        if(client != null)
        client.run();
    }
}
