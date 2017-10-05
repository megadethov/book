package ua.mega.concurrency._05_Failed_Transfer_Counter;

import javax.naming.InsufficientResourcesException;
import java.util.concurrent.TimeUnit;

public class Operations {
    public static void main(String[] args) throws InsufficientResourcesException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            public void run() {
                try {
                    transfer(a, b, 500);
                } catch (InsufficientResourcesException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        transfer(b, a, 300);
    }

    static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException {
        if (acc1.getBalance() < amount) {
            throw new InsufficientResourcesException();
        }
        // пытаемся захватить 1-й ресурс в течении 1 сек
        try {
            if (acc1.getLock().tryLock(1, TimeUnit.SECONDS)) { // требует обработки InterruptedException
                try {
                    // пытаемся захватить 2-й ресурс в течении 1 сек
                    if (acc2.getLock().tryLock(1, TimeUnit.SECONDS)) { // требует обработки InterruptedException
                        try {
                            acc1.withdraw(amount);
                            acc2.deposit(amount);
                        } finally {
                            acc2.getLock().unlock();
                        }
                    }
                } finally {
                    acc1.getLock().unlock();
                }
            } else {
                System.out.println("Sorry - не удалось выполнить трансфер");
                // здесь снова не thread safe, тк много потоков могут инкрементить
                // volatile работает только для атомарных операций, например запись-чтение - true/false, increment - не атомарная
                // делать снова lock - не хорошо. Как сделать инкремент атомарным? - Atomic - не блокирует другие потоки. Есть для разных типов.
                acc1.incFailedTransferCount();
                acc2.incFailedTransferCount();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
