package ua.mega.Functional_Interfaces.Example02;

/*
A functional interface can have methods of object class.
See in the following example.
 */
public class FunctionalInterfaceExample implements Sayable {

    @Override
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
        fie.say("Hello");
    }
}

@FunctionalInterface
interface Sayable{
    void say(String msg);  // abstract method

    // It can contain any number of methods of Object class.

    int hashCode();

    String toString();

    boolean equals(Object obj);
}