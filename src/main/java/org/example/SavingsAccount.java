package org.example;

public class SavingsAccount extends Account { // TODO implementar otras subclases como CheckingAccount o FixedDepositAccount
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate, String pin) {
        super(accountNumber, initialBalance, pin);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {
        super();
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
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
