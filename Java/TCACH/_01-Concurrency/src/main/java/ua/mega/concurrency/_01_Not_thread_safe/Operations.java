package ua.mega.concurrency._01_Not_thread_safe;

import javax.naming.InsufficientResourcesException;

public class Operations {
    public static void main(String[] args) throws InsufficientResourcesException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {
            public void run() {
                try {
                    transfer(a,b,500);
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

        acc1.withdraw(amount);
        System.out.println("Accaunt 1 - withdraw...");
        acc2.deposit(amount);
        System.out.println("Accaunt 2 - deposit...");
        System.out.println("Accaunt 1 = " + acc1.getBalance());
        System.out.println("Accaunt 2 = " + acc2.getBalance());
    }
}
