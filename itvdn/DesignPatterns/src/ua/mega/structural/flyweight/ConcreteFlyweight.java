package ua.mega.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {
    int extrinsicState;

    @Override
    public void operation(int extrinsicState) {
        this.extrinsicState = extrinsicState;
    }
}
