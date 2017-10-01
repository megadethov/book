package ua.mega.lecture7.item1_extendsThread;

/**
 * Created by Yefremov Yuriy
 */
// 1 способ создания потока, путем расширения класса Thread и переопределения run()
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End thread: " + currentThread());
    }
}
