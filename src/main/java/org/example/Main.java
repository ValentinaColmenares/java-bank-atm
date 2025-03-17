package org.example;

public class Main {
    public static void main(String[] args) throws Account.InsufficientFundsException {
        Account myAccount = new SavingsAccount("12345", 1000.0, 0.05, "1234");
        myAccount.deposit(200.0);
        myAccount.withdraw(50.0);
        System.out.println(myAccount.getBalance());

    }
}
