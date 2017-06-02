package ua.mega.creational.abstract_factory.implementation;

import ua.mega.creational.abstract_factory.abstraction.AbstractBottle;
import ua.mega.creational.abstract_factory.abstraction.AbstractWater;

public class CocaColaBottle implements AbstractBottle {
    public CocaColaBottle() {
        System.out.println("Create CocaColaBottle ...");
    }

    @Override
    public void pack(AbstractWater water) {
        System.out.println("Pack CocaColaBottle ...");
    }
}
