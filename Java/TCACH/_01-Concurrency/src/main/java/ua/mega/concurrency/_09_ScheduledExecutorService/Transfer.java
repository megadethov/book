package ua.mega.concurrency._09_ScheduledExecutorService;

import javax.naming.InsufficientResourcesException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Transfer implements Callable<Boolean> {

   private Account acc1;
   private Account acc2;
   private int amount;

    public Transfer(Account acc1, Account acc2, int amount) {
        this.acc1 = acc1;
        this.acc2 = acc2;
        this.amount = amount;
    }

    public Boolean call() throws Exception {
        if (acc1.getBalance() < amount) {
            throw new InsufficientResourcesException();
        }

        try {
            // пытаемся захватить 1-й ресурс в течении 1 сек
            if (acc1.getLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    // пытаемся захватить 2-й ресурс в течении 1 сек
                    if (acc2.getLock().tryLock(1, TimeUnit.SECONDS)) {
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
                acc1.getFailCounter().incrementAndGet();
                acc2.getFailCounter().incrementAndGet();
                return false; // трансфер не прошел
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true; // трансфер прошел
    }
}
