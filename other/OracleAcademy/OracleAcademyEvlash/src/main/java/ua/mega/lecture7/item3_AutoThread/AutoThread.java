package ua.mega.lecture7.item3_AutoThread;

/**
 * Created by Yefremov Yuriy
 */
// авто создание потока
public class AutoThread implements Runnable {

    Thread thread = null; // объявляем ссылку на поток

    //конструктор создает и стартует поток принимая в кач-ве Runnable текущий класс
    public AutoThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() { // реализуем run()
        System.out.println("Hello " + thread.getName());
    }
}

class App {
    public static void main(String[] args) {
        AutoThread thread = new AutoThread("AutoThread"); //достаточно создать инстанс AutoThread и он сам создаст и стартонет поток
    }
}
