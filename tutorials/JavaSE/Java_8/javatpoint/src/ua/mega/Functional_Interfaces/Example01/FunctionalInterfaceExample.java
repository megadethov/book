package ua.mega.Functional_Interfaces.Example01;

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
