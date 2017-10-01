package ua.mega.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent");
    }
}
