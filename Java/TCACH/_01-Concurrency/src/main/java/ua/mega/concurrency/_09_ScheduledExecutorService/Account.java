package ua.mega.concurrency._09_ScheduledExecutorService;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private final Lock lock = new ReentrantLock();
    private AtomicInteger failCounter = new AtomicInteger(0); // атомик инкремент

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public Lock getLock() {
        return lock;
    }

    public AtomicInteger getFailCounter() {
        return failCounter;
    }
}
