package ua.mega.Lecture_8_9_Thread.item_13;

public class DataRace {
    public static void main(String[] args) {
        UserCounter target = new UserCounter();
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);

        t1.start();
        t2.start();
        t3.start();
    }
}

class UserCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++);
        increment();
        for (int i = 0; i < 1000000; i++);
        increment();
        for (int i = 0; i < 100000; i++);
        increment();
    }

    private void increment() {
       /*synchronized (DataRace.class)*/ { // без блока синхронизации счетчик меняется беспорядочно
           Counter.count++;
           System.out.println(Counter.count + " ");
       }
    }
}

class Counter {
    public static long count = 0;
}