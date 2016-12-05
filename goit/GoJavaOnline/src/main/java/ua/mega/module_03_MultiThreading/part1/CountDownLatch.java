package ua.mega.module_03_MultiThreading.part1;

public class CountDownLatch {

    private int counter = 0; // флаг для запуска потоков
    private final Object lock = new Object(); // чтобы не синхронизироваться по this, создаем поле lock - final обязательно

    public CountDownLatch(int counter) {
        this.counter = counter;
    }

    public void await() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                if (counter > 0) {
                    lock.wait(); // чтобы вызвать wait() надо захватить монитор - lock (синхронизироваться по lock)
                } else {
                    notify(); // другой поток оживет не здесь
                    break;
                }
            } // другой поток оживет здесь - когда вы покидаете синхро секцию - освобождаете монитор
        }
    }

    public void countDown() { // декрементит счетчик
        synchronized (lock) {
            if (counter > 0) {
                counter --;
            }
            if (counter == 0) { // нужно пронотифицировать потоки из wait о том, что они могут проснуться и продолжить работу
                 lock.notify();
            }
        }
    }
}
