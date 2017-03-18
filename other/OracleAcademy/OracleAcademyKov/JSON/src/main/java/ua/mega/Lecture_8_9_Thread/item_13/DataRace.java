package ua.mega.Lecture_8_9_Thread.item_13;

public class DataRace {

        public static int counter = 0; // статическое поле - общее для всех потоков

    public static void main(String[] args) {
        UserCounter target = new UserCounter();
        // синхронизация работает для общего таргета, если же сделать 3 таргета для каждого Thread,
        // то у каждого будет свой блок синхронизации, те снхронизации не будет
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);

        t1.start();
        t2.start();
        t3.start();
    }
}

class UserCounter implements Runnable {

    @Override
    public void run() {
        sum();
        sum();
        sum();

    }

    public /*synchronized*/ void  sum() { // 1) может засинхронизировать метод, к-ый трогает общие данные (по объекту откуда вызов)
//        synchronized (this) // 2) можем засинхронизировать блок в котором чтение-изменение общих данных (по this - по каждому объекту)
//        synchronized (DataRace.class) // 3) можем засинхронизировать блок в котором чтение-изменение общих данных (по объекту Class нашего класса)
        {
            DataRace.counter++; // инкремент статического поля

            // просто работа для нагрузки
            for (int i = 0; i < 10000000; i++) {
                String[] arr = {new String()};
            }

            System.out.println(DataRace.counter); // чтение статического поля
        }
    }

}

