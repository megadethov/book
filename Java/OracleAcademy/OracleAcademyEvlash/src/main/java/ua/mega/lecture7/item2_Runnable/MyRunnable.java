package ua.mega.lecture7.item2_Runnable;

/**
 * Created by Yefremov Yuriy
 */
// 2 способ создания потока ч/з имплементацию интерфейса Runnable
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // статик метод класса Thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Runnable - " + Thread.currentThread().getName());
    }
}

class App {
    public static void main(String[] args) {
        System.out.println("Start " + Thread.currentThread().getName());

        new Thread(new MyRunnable()).start(); // создаем анонимный поток и на вход конструктору даем Runnable с реализацией

        // тоже самое с помощью лямбд, не требует создпния отдельного класса с имплементацией Runnable

        new Thread(() -> System.out.println("lambda - " + Thread.currentThread())).start(); // () -> скобки пустые тк метод run() не требует аргументов



    }
}
