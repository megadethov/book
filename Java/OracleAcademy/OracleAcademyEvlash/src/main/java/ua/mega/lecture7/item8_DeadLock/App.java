package ua.mega.lecture7.item8_DeadLock;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Target());
        Thread t2 = new Thread(new Target());
        t1.start();
        t2.start();

        System.out.println("WAITING .......");

        t2.join();
        t1.join();

        System.out.println("ALL DONE !");
    }
}

class Target implements Runnable {

    @Override
    public void run() {
        incrementCounter1Before();
        incrementCounter2Before();
    }

    public void incrementCounter1Before() {
        synchronized (Counter1.class) {
            synchronized (Counter2.class) {
                Counter1.count1++;
                Counter2.count2++;
            }
        }
    }

    public void incrementCounter2Before() {
        synchronized (Counter2.class) {
            synchronized (Counter1.class) {
                Counter2.count2++;
                Counter1.count1++;
            }
        }
    }
}

class Counter1 {
    public static int count1;
}

class Counter2 {
    public static int count2;
}
