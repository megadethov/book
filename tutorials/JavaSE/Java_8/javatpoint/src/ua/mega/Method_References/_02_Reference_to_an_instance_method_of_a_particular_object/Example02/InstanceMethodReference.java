package ua.mega.Method_References._02_Reference_to_an_instance_method_of_a_particular_object.Example02;

/*
In the following example, we are referring instance (non-static) method.
Runnable interface contains only one abstract method. So, we can use it as
functional interface.
 */
public class InstanceMethodReference {

    public static void main(String[] args) {
        Thread t2 = new Thread(new InstanceMethodReference()::printnMsg);
        t2.start();
    }

    public void printnMsg() {
        System.out.println("Hello, this is instance method");
    }

}
