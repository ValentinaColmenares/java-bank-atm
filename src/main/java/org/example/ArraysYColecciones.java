package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysYColecciones {
    /*public static void main(String[] args) {
        int[] transactionIds = new int[5]; // Array para 5 transacciones
        transactionIds[0] = 101;
        transactionIds[1] = 102;

        ArrayList<String> transactionHistory = new ArrayList<>();
        transactionHistory.add("Deposit $500");
        transactionHistory.add("Withdraw $200");

        transactionHistory.remove(1); // Elimina la segunda transacción
        String firstTransaction = transactionHistory.get(0); // Obtiene la primera transacción
        transactionHistory.set(0, "Deposit $1000"); // Modifica la primera transacción

        // Recorrer array
        for (int i = 0; i < transactionIds.length; i++) {
            System.out.println("Transaction ID: " + transactionIds[i]);
        }

        // Recorrer ArrayList
        for (String transaction : transactionHistory) {
            System.out.println("Transaction: " + transaction);
        }

        HashMap<String, Double> accountBalances = new HashMap<>();
        accountBalances.put("123456", 1500.0);
        accountBalances.put("654321", 2000.0);


        import java.util.ArrayList;

        public class Main {*/
            public static void main(String[] args) {
                double balance = 1000.0;
                ArrayList<String> transactionHistory = new ArrayList<>();

                balance = deposit(500, balance, transactionHistory);
                balance = withdraw(100, balance, transactionHistory);

                System.out.println("Balance final: " + balance);
                for (String transaction : transactionHistory) {
                    System.out.println(transaction);
                }
            }

            public static double deposit(double amount, double balance, ArrayList<String> transactionHistory) {
                balance += amount;
                transactionHistory.add("Deposited: $" + amount);
                return balance;
            }

            public static double withdraw(double amount, double balance, ArrayList<String> transactionHistory) {
                if (balance >= amount) {
                    balance -= amount;
                    transactionHistory.add("Withdrew: $" + amount);
                } else {
                    System.out.println("Insufficient funds");
                }
                return balance;
            }
        /*}


    }*/
}
