package ua.mega.Lecture_8_9_Thread.item_3;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new ThreadX();
        Thread t2 = new Thread(new ThreadY());
        // старт 2 оба потока
        t1.start();
        t2.start();
    }
}

class ThreadX extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("X");
        }
    }
}

class ThreadY implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.print("Y");
        }
    }
}
