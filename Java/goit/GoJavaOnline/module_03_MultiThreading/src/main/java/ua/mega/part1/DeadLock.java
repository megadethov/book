package main.java.ua.mega.part1;

import java.util.Random;

public class DeadLock {

    public static Random random = new Random();
    private static Account account1 = new Account(100L, 1);
    private static Account account2 = new Account(200L, 2);

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
       final Account a1; //final - тк по ним синхро
       final  Account a2;
        if (source.compareTo(target) > 0) {
            a1 = source;
            a2 = target;
        } else {
            a1 = target;
            a2 = source;
        }

        // во избежание параллельного изменения счетов разными потоками, нужно захватить мониторы обоих счетов
        synchronized (a1) {
            synchronized (a2) {
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

    public static class Account implements Comparable<Account>{
        private long balance;
        private long id;

        public Account(long balance, int id) {
            this.balance = balance;
            this.id = id;
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

        @Override
        public int compareTo(Account o) {
            if (this.id > o.id) return 1;
            if (this.id < o.id) return -1;
            return 0;
        }
    }
}
