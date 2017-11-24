package p02_Classes.Constructors;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Class<Cat> aClass = Cat.class;
        Constructor<?>[] constructors = aClass.getConstructors();
        String name = constructors[0].getName(); // p02_Classes.Constructors.Cat
    }
}

class Cat{
    private String name;
    private int age;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}