package p02_Classes.Implemented_Interfaces;

import java.io.Serializable;

public class Main implements Serializable, Cloneable {
    public static void main(String[] args) {
//        It is possible to get a list of the interfaces implemented by a given class. Here is how:
        Class<Main> aClass = Main.class;
        Class<?>[] interfaces = aClass.getInterfaces(); // java.io.Serializable, java.lang.Cloneable
    }
}
