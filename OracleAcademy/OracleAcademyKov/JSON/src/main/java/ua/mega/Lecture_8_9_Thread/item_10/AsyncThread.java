package ua.mega.Lecture_8_9_Thread.item_10;

public class AsyncThread extends Thread {
    //Класс демонстрирует работу несинхронизированных thread-ов.
    @Override
    public void run() {
        System.out.println("Starting the thread " + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - iteration" + i);
            try {
                //задержка перед следующей итерацией
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        AsyncThread t1 = new AsyncThread();
        AsyncThread t2 = new AsyncThread();
        t1.start();
        t2.start();
    }
}
