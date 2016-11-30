package ua.mega.Lecture_8_9_Thread.item_5;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
             /*
            Если добавить sleep(3000), то потоки сильнее перепутаются.
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            */

            System.out.println(Thread.currentThread().getName() + " - " + i);
              /*
            Thread.currentThread().getName()
            выдаёт имя потока, например Thread-1;

            Thread.currentThread()
            выдаёт [имя потока, приоритет, (и ещё что-то?)]
            */
        }
    } // run

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

        t1.start();
        t2.start();

    }
}
