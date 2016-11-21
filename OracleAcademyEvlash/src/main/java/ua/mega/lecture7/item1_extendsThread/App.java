package ua.mega.lecture7.item1_extendsThread;

/**
 * Created by Yefremov Yuriy
 */
public class App {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread("MyThread2");

        myThread.start();
        myThread2.start();

        System.out.println("End thread: " + Thread.currentThread());

        // Можно стартонуть поток с помощью анонимного класса
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Anonim: " + Thread.currentThread().getName());
                }
            }
        }.start();

    }
}
