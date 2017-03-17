package ua.mega.Method_References._01_Reference_to_a_Static_Method.Example02;

//In the following example, we are using predefined functional interface Runnable
//to refer static method.

public class MethodReference {
    public static void main(String[] args) {

        Thread t2 = new Thread(MethodReference::ThreadStatus);
        t2.start();
    }

    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }
}
