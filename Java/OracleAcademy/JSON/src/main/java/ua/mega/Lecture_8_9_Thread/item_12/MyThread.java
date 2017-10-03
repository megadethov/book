package ua.mega.Lecture_8_9_Thread.item_12;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        t.join(); // ждем завершения t
        System.out.println(t.getState());

    }
}
