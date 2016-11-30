package ua.mega.Lecture_8_9_Thread.item_1;

public class MyThread extends Thread { // оздание нового потока - расширение Thread
    @Override
    public void run() { // переопределение run()
        try {
            sleep(3000);
            // две равнозначных строчки
            System.out.println(Thread.currentThread().getName());
            System.out.println(this.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // запуск потока
//        thread.start(); // повторный запуск потока - java.lang.IllegalThreadStateException

        System.out.println(Thread.currentThread().getName());
    }
}
