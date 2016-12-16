package ua.mega.creational.abstract_factory.abstraction;

import ua.mega.creational.abstract_factory.abstraction.AbstractBottle;
import ua.mega.creational.abstract_factory.abstraction.AbstractFactory;
import ua.mega.creational.abstract_factory.abstraction.AbstractWater;

public class Client {
    private AbstractBottle bottle;
    private AbstractWater water;

    public Client(AbstractFactory factory) {
        this.bottle = factory.createBottle();
        this.water = factory.createWater();
    }

    public void run() {
        bottle.pack(water);
    }
}
