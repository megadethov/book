package ua.mega.creational.abstract_factory.implementation;

public class CocaColaFactory {
    CocaColaBottle createBottle() {
        return new CocaColaBottle();
    }

    CocaColaWater createWater() {
        return new CocaColaWater();
    }


}
