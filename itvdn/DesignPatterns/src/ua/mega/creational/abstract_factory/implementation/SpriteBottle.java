package ua.mega.creational.abstract_factory.implementation;

import ua.mega.creational.abstract_factory.abstraction.AbstractBottle;
import ua.mega.creational.abstract_factory.abstraction.AbstractWater;

public class SpriteBottle implements AbstractBottle {
    public SpriteBottle() {
        System.out.println("Create SpriteBottle ...");
    }

    @Override
    public void pack(AbstractWater water) {
        System.out.println("Pack SpriteBottle ...");
    }
}
