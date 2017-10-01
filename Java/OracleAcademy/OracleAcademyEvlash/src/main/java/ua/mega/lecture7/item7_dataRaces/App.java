package ua.mega.lecture7.item7_dataRaces;

/**
 * Created by Yefremov Yuriy
 */
public class App {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        // все потоки одновременно меняют одно статическое поле Counter.counter - получается чехорда
        myThread.start();
        myThread2.start();
        myThread3.start();
    }
}
