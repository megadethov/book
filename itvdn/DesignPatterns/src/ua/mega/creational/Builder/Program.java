package ua.mega.creational.Builder;

public class Program {
    public static void main(String[] args) {
        Bulder bulder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
    }
}
