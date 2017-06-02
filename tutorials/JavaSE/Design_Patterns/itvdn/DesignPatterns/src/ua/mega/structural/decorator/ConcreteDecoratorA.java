package ua.mega.structural.decorator;

public class ConcreteDecoratorA extends Decorator {
    private String addedState = "Some state";

    @Override
    public void operation() {
        super.operation(); // декоратор выполняет основную логику - декорируемого компонента

        System.out.println(addedState);// + добавляет свою
    }
}
