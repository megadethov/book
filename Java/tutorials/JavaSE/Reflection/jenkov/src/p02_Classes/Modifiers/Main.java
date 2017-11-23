package p02_Classes.Modifiers;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
//        You can access the modifiers of a class via the Class object. The class modifiers are the keywords
//        "public", "private", "static" etc. You obtain the class modifiers like this:
        Class<Cat> catClass = Cat.class;
        int modifiers = catClass.getModifiers();

//        The modifiers are packed into an int where each modifier is a flag bit that is either set or cleared.
//        You can check the modifiers using these methods in the class java.lang.reflect.Modifier:
        boolean aPublic = Modifier.isAbstract(modifiers); // true
    }
}

abstract class Cat {
    public void toDo(){

    }
}