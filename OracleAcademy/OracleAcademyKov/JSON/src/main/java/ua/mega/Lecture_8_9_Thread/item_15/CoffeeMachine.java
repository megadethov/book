package ua.mega.Lecture_8_9_Thread.item_15;

public class CoffeeMachine extends Thread {

    static String coffeeMade = null; // приготовленный кофе
    static final Object lock = new Object(); // он один на всех и называется символически - lock, те это тот объект
    // по к-му мы будем лочиться. Синхронизация между всеми потоками будет происходить всегда по объекту lock
    private static int coffeeNumber = 1; // счетчик приготовленного кофе

    void makeCoffee() { // метод - приготовление кофе
        synchronized (CoffeeMachine.lock) { // засинхронизирован по статик константе - lock
            if (coffeeMade != null) { // проверяем, что приготовленного кофе нет
                System.out.println("Coffee machine: Waiting for waiter notification to deliver the coffee");
                try {
                    CoffeeMachine.lock.wait(); // поток написал сообщение, ушел в wait-set и снял блокировку
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } // if
            coffeeMade = "Coffee No. " + coffeeNumber++;
            System.out.println("Coffee machine says: Made " + coffeeMade);
            // once coffee is ready, notify the waiter to pick it up
            CoffeeMachine.lock.notifyAll();
            System.out.println("Coffee machine: Notifying waiter to pick the coffee ");
        } // synchronized
    } // makeCoffee

    @Override
    public void run() {
        while (true) {
            makeCoffee();
            try {
                System.out.println("Coffee machine: Making another coffee now");
                // simulate the time taken to make a coffee by calling sleep method
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                // its okay to ignore this exception
                // since we're not using thread interrupt mechanism
                ie.printStackTrace();
            }
        }
    }
}
