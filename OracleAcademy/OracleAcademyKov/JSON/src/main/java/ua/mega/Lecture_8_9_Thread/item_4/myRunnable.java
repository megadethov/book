package ua.mega.Lecture_8_9_Thread.item_4;

public class myRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new myRunnable());
        thread.run(); // отработает в main()
        //Если мы не вызвали метод .start(), то thread будет всё тот же с именем main.
        System.out.println(Thread.currentThread().getName());
    }
}
