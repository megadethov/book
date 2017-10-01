package ua.mega.Functional_Interfaces.Example04;

/*
In the following example, a functional interface is extending to
a non-functional interface
 */
public class FunctionalInterfaceExample implements Sayable {
    @Override
    public void Say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample();

        functionalInterfaceExample.Say("Hello");
        functionalInterfaceExample.doIt();
    }
}

interface doAble{
    default void doIt(){
        System.out.println("Do it now");
    }
}

@FunctionalInterface
interface Sayable extends doAble{
    void Say(String msg); // abstract method
}
