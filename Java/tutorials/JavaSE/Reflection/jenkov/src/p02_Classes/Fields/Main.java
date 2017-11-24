package p02_Classes.Fields;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
//        You can access the (ONLY PUBLIC) fields (member variables) of a class like this:
        Class<Cat> aClass = Cat.class;
        Field[] fields = aClass.getFields();
        String name = fields[0].getName(); // name
    }
}

class Cat {
    public String name;
    public int age;
}