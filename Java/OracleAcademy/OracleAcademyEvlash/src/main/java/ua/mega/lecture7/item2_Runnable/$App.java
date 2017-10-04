package ua.mega.lecture7.item2_Runnable;

public class $App {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Target()).start();

        System.out.println(Thread.currentThread().getName());
    }
}

class Target implements Runnable {

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
    }
}