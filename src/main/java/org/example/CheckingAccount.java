package org.example;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, double balance, String pin) {
        super(accountNumber, balance, pin);
    }

    public CheckingAccount() {

    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > getBalance()) {
            throw new InsufficientFundsException();
        }else{
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
}

