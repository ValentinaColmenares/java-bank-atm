package org.example;

import java.util.ArrayList;

public class ATM { //TODO
    public static void main(String[] args) {
        System.out.println("Welcome to JavaBank ATM! Version control with Git.");

        // Variables básicas
        String accountNumber = "123456789";
        double balance = 1500.75;
        int pin = 1234;
        boolean isActive = true;
        char initial = 'A';
        byte age = 30;

        // Array de montos de transacciones
        int[] transactionAmounts = {200, -100, 50};
        ArrayList<String> transactions = new ArrayList<>();
        transactions.add("Deposito");

        // Operaciones con variables
        balance += transactionAmounts[0]; // Depósito
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso Concedido");
        }

        // Uso de operadores
        balance++; // Incremento
        String status = (balance < 0) ? "Deuda" : "Crédito";
        System.out.println("Estado de cuenta: " + status);

        // if, else
        double amountRequested = 200;
        boolean hasFunds = balance > amountRequested;
        String inputPin = "1234";
        if (hasFunds && String.valueOf(pin).equals(inputPin)) {
            System.out.println("Transacción autorizada");
        } else {
            System.out.println("Error en transacción");
        }
    }
}
