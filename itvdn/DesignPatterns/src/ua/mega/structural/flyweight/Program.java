package ua.mega.structural.flyweight;

public class Program {
    public static void main(String[] args) {
        int extrinsicState = 0;

        Flyweight flyweight = null;
        FlyweightFactory factory = new FlyweightFactory();

        flyweight = factory.getFlyweight("1");
        flyweight.operation(extrinsicState);

        flyweight = factory.getFlyweight("10");
        flyweight.operation(extrinsicState);

        flyweight = new UnsharedConcreteFlyweight();
        flyweight.operation(extrinsicState);
    }
}
