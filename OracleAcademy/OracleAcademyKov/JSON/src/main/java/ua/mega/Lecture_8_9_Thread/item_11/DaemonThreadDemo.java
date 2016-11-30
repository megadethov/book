package ua.mega.Lecture_8_9_Thread.item_11;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        System.out.println("     main start");
        MyThread myThread = new MyThread();
//        myThread.setDaemon(true); // сетится перед стартом потока
        myThread.start();
        System.out.println("Is MyThread daemon: " + myThread.isDaemon());
        System.out.println("     main close");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run start");
            sleep(5000);
            System.out.println("run close");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


