package ua.mega.structural.decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation(); // декоратор выполняет основную логику - декорируемого компонента

       addedBehavior(); // + добавляет свою
    }

    public void addedBehavior() {
        System.out.println("Behavior");
    }
}
