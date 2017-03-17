package ua.mega.Method_References._01_Reference_to_a_Static_Method.Example1;

interface Sayable{
    void say();
}

public class MethodReference {
    public static void main(String[] args) {

        // Lambda style
//        Sayable sayable = () -> saySomething();

        // Referring static method
        Sayable sayable = MethodReference::saySomething;

        // Calling interface method
        sayable.say();
    }

    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }
}
