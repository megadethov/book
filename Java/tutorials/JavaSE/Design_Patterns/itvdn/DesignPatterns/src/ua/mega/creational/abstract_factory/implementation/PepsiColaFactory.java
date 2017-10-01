package ua.mega.creational.abstract_factory.implementation;

import ua.mega.creational.abstract_factory.abstraction.AbstractBonusBooklet;
import ua.mega.creational.abstract_factory.abstraction.AbstractFactory;

public class PepsiColaFactory implements AbstractFactory {

    public PepsiColaFactory() {
        System.out.println("Create PepsiColaFactory ...");
    }

    public PepsiColaBottle createBottle() {
        return new PepsiColaBottle();
    }

    public PepsiColaWater createWater() {
        return new PepsiColaWater();
    }

    @Override
    public AbstractBonusBooklet createBonusBooklet() {
        return new PepsiColaBonusBooklet();
    }
}
