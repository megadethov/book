package ua.mega.Lecture_8_9_Thread.item_2;

//public class MyRunnable extends Thread implements Runnable {
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("In run method Thread's name is: " + Thread.currentThread().getName());
        //System.out.println("In run method Thread's name is: " + this.getName());
        //второй способ даст ошибку компиляции. Чтоб её исправить надо сделать
        //extends Thread
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
            t.start();
        System.out.println("In main method Thread's name is: " + Thread.currentThread().getName());

    }
}
