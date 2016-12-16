package ua.mega.creational.abstract_factory.implementation;

import ua.mega.creational.abstract_factory.abstraction.AbstractBonusBooklet;
import ua.mega.creational.abstract_factory.abstraction.AbstractFactory;

public class CocaColaFactory implements AbstractFactory {

    public CocaColaFactory() {
        System.out.println("Create CocaColaFactory ...");
    }

    public CocaColaBottle createBottle() {
        return new CocaColaBottle();
    }

    public CocaColaWater createWater() {
        return new CocaColaWater();
    }

    @Override
    public AbstractBonusBooklet createBonusBooklet() {
        return new PepsiColaBonusBooklet();
    }
}
