package ua.mega.lecture7.item7_dataRaces;

/**
 * Created by Yefremov Yuriy
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        counter();
        counter();
        counter();
    }

    private /*synchronized*/ void counter() { // синхронизация метода не спасает от чехорды нескольких потоков,
        // тк у каждого потока будет свой метод и соответственно - монитор

        // нужен синхро блок по классу Counter
        synchronized (Counter.class) { // синхро блок по классу - теперь чехорды нет
            Counter.count++; // метод меняет статическое поле
            for (int i = 0; i < 100000000; i++) { // какая-то тяжелая работа
                new String("AAAAAA");
            }
            System.out.println(Counter.count);
        }

    }
}
