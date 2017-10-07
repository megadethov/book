package ua.mega.structural.decorator;

public class Program {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA();
        Decorator decoratorB = new ConcreteDecoratorB();

        /*decoratorA.component = component;
        decoratorB.component = decoratorA;
        decoratorB.operation();*/

        decoratorA.component = component; // насетить поле Декоратора объектом для декорирования
        decoratorA.operation();

        decoratorB.component = component; // насетить поле Декоратора объектом для декорирования
        decoratorB.operation();


    }
}
