package org.example;

public class Account {
    private String accountNumber;
    private double balance;

    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException() {
            super("Fondos insuficientes para realizar la operación.");
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException();
        }
        this.balance -= amount;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + this.balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }


}

