package ua.mega.creational.abstract_factory.abstraction;

public class Client {
    private AbstractBottle bottle;
    private AbstractWater water;
    private AbstractBonusBooklet bonusBooklet;

    public Client(AbstractFactory factory) {
        this.bottle = factory.createBottle();
        this.water = factory.createWater();
        this.bonusBooklet = factory.createBonusBooklet();
    }

    public void run() {
        bottle.pack(water);
    }
}
