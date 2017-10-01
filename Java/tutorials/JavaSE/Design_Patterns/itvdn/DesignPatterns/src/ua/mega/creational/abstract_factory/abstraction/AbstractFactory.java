package ua.mega.creational.abstract_factory.abstraction;

public interface AbstractFactory {

    AbstractBottle createBottle();

    AbstractWater createWater();

    AbstractBonusBooklet createBonusBooklet();
}
