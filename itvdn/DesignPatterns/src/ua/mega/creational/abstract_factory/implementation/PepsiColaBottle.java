package ua.mega.creational.abstract_factory.implementation;

import ua.mega.creational.abstract_factory.abstraction.AbstractBottle;
import ua.mega.creational.abstract_factory.abstraction.AbstractWater;

public class PepsiColaBottle implements AbstractBottle {
    public PepsiColaBottle() {
        System.out.println("Create PepsiColaBottle ...");
    }

    @Override
    public void pack(AbstractWater water) {
        System.out.println("Pack PepsiColaBottle ...");
    }
}
