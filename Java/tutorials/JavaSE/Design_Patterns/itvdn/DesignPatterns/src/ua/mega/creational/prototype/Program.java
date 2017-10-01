package ua.mega.creational.prototype;

public class Program {
    public static void main(String[] args) {

        Prototype prototype1 = new ConcretePrototype1(100);
        Prototype clone = prototype1.cloning();

        Prototype prototype2 = new ConcretePrototype2(200);
        Prototype clone2 = prototype2.cloning();

        System.out.println(prototype1.getId());
        System.out.println(clone.getId());
        System.out.println(prototype2.getId());
        System.out.println(clone2.getId());
    }
}


