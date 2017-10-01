package ua.mega.Method_References._01_Reference_to_a_Static_Method.Example02;

//In the following example, we are using predefined functional interface Runnable
//to refer static method.

public class MethodReference {
    public static void main(String[] args) {

        // var-1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                MethodReference.ThreadStatus();
            }
        });
        t1.start();

        // var-2
        Thread t2 = new Thread(() -> MethodReference.ThreadStatus());
        t2.start();

        // var-3
        Thread t3 = new Thread(MethodReference::ThreadStatus);
        t3.start();
    }

    public static void ThreadStatus() {
        System.out.println("Thread is running...");
    }
}
