package ua.mega.Lecture_8_9_Thread.item_15;

// Покупатель кофе - отдельный поток
public class Waiter extends Thread {

    @Override
    public void run() { // у него есть метод run(), к-ый всегда просит кофе
        while (true) { // до тех пор пока Юзер не наберет ctrl-C
            getCoffee();
        }
    }

    private void getCoffee() {
        synchronized (CoffeeMachine.lock) { // блок синхронизирован по static final полю КофеМашины - lock
            if (CoffeeMachine.coffeeMade == null) {
                try { // wait till the CoffeeMachine says (notifies) that coffee is ready

                    System.out.println("Waiter: Will get orders till coffee machine notifies me ");
                    // вейтиться можно только по тому объекту, по к-му засинхронизированы
                    // метод wait снимает блокировку и другие потоки могут войти, в тч и КофеМашина, тк она тоже засинхронизирована по этому объекту
                    CoffeeMachine.lock.wait();
                } catch (InterruptedException e) {
                    // its okay to ignore this exception
                    // since we're not using thread interrupt mechanism
                    e.printStackTrace();
                }
            } // if

            System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
            CoffeeMachine.coffeeMade = null;
            // ask (notify) the coffee machine to prepare the next coffee
            CoffeeMachine.lock.notifyAll();
            System.out.println("Waiter: Notifying coffee machine to make another one");
        }
    }


}
