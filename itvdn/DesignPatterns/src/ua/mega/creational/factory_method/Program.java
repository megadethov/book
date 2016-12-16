package ua.mega.creational.factory_method;

public class Program {
    public static void main(String[] args) {

        Creator creator;
        Product product;

        creator = new ConcreteCreator();
        product = creator.factoryMethod();

        creator.anOperation();
    }
}
