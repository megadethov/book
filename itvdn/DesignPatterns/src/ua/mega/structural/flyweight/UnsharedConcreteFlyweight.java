package ua.mega.structural.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {
    int allState;

    @Override
    public void operation(int extrinsicState) {
        allState = extrinsicState;
    }
}
