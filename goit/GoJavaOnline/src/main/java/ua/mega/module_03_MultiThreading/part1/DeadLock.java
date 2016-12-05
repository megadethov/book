package ua.mega.module_03_MultiThreading.part1;

import java.util.Random;

public class DeadLock {

    public static Random random = new Random();
    private static Account account1 = new Account(100L);
    private static Account account2 = new Account(200L);

    public static void main(String[] args) {
        new Thread(new Worker()).start();
        new Thread(new Worker()).start();
    }

    public static class Worker implements Runnable {

        @Override
        public void run() {
            if (random.nextBoolean()) {
                transfer(account1, account2, random.nextInt(10));
            } else {
                transfer(account2, account1, random.nextInt(10));
            }
        }
    }

    public static void transfer(Account source, Account target, long amount) {
        // во избежание параллельного изменения счетов разными потоками, нужно захватить мониторы обоих счетов
        synchronized (source) {
            synchronized (target) {
                if (source.getBalance() >= amount) {
                    source.withdraw(amount);
                    target.put(amount);
                    System.out.println("Transfer: " + amount);
                } else {
                    System.out.println("Not enough money");
                }
            }
        }
    }

    public static class Account {
        private long balance;

        public Account(long balance) {
            this.balance = balance;
        }

        public long getBalance() {
            return balance;
        }

        public void put(long amount) {
            balance += amount;
        }

        public void withdraw (long amount) {
            balance -= amount;
        }

    }
}
