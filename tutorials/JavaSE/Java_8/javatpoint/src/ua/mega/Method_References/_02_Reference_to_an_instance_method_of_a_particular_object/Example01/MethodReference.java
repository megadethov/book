package ua.mega.Method_References._02_Reference_to_an_instance_method_of_a_particular_object.Example01;

/*
In the following example, we are referring non-static methods.
You can refer methods by class object and anonymous object.
 */
interface Sayable {
    void say();
}

public class MethodReference {

    public static void main(String[] args) {
        // Creating object
        MethodReference methodReference = new MethodReference();

        // Referring non-static method using reference
        Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();

        // Referring non-static method using anonymous object
        Sayable sayable2 = new MethodReference()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }

    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }
}
