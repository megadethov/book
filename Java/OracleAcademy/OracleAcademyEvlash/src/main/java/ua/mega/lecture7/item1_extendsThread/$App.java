package ua.mega.lecture7.item1_extendsThread;

public class $App {
    public static void main(String[] args) {
        new Thread2().start();

        System.out.println(Thread.currentThread().getName());
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            sleep(2000);
            System.out.println(this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}