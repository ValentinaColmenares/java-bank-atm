package org.example;

public abstract class Account implements Authenticatable {
    private String accountNumber;
    private double balance;
    private String pin;

    public Account(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public Account() {

    }

    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException() {
            super("Fondos insuficientes para realizar la operación.");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;
    public abstract void deposit(double amount);

    @Override
    public boolean authenticate(String pin) {
        return this.pin.equals(pin);
    }
}

/*public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException();
        }
        this.balance -= amount;
    }*/