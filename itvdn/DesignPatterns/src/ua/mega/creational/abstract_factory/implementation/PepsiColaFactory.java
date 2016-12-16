package ua.mega.creational.abstract_factory.implementation;

public class PepsiColaFactory {
    PepsiColaBottle createBottle() {
        return new PepsiColaBottle();
    }

    PepsiColaWater createWater() {
        return new PepsiColaWater();
    }
}
