package ua.mega.concurrency._09_ScheduledExecutorService;

import javax.naming.InsufficientResourcesException;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Operations2 {
    public static void main(String[] args) throws InsufficientResourcesException, InterruptedException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        // Пускач для Thread. submit - Callable, execute - Runnable
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i =10; i < 10; i++) {
            service.submit(new Transfer(a, b, new Random().nextInt(400))); // submit -> Future, из к-го можно достать возвращаемое Callable значение
        }

        // Запланированный пускач
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        ses.scheduleAtFixedRate(() -> System.out.println("Hello"), 1, 2, TimeUnit.SECONDS);

        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);

    }
}
