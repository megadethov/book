package ua.mega.Functional_Interfaces.Example01;

/*
Functional Interface also known as Single Abstract Method Interfaces or
SAM Interfaces. It is a new feature in Java, which helps to achieve
functional programming approach.
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
    void say(String msg);
}
