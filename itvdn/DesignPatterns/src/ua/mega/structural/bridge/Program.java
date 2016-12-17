package ua.mega.structural.bridge;

public class Program {
    public static void main(String[] args) {

        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        Abstraction abstraction2 = new RefinedAbstraction(new ConcreteImplementorB());

        abstraction.operation();
        abstraction2.operation();
    }
}
