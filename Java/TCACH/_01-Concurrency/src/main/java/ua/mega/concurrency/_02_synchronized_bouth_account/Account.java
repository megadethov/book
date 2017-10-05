package ua.mega.concurrency._02_synchronized_bouth_account;

public class Account {
    private int balance;

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
}
