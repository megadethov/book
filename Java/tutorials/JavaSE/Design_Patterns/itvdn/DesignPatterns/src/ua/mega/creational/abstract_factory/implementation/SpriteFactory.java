package ua.mega.creational.abstract_factory.implementation;

import ua.mega.creational.abstract_factory.abstraction.AbstractBonusBooklet;
import ua.mega.creational.abstract_factory.abstraction.AbstractBottle;
import ua.mega.creational.abstract_factory.abstraction.AbstractFactory;
import ua.mega.creational.abstract_factory.abstraction.AbstractWater;

public class SpriteFactory implements AbstractFactory {
    public SpriteFactory() {
        System.out.println("Create SpriteFactory ...");
    }

    @Override
    public AbstractBottle createBottle() {
        return new SpriteBottle();
    }

    @Override
    public AbstractWater createWater() {
        return new SpriteWater();
    }

    @Override
    public AbstractBonusBooklet createBonusBooklet() {
        return new SpriteBonusBooklet();
    }
}
