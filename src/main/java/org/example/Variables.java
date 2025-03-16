package org.example;

import java.util.ArrayList;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaBank ATM! Version control with Git.");
        int pin = 1234;
        double balance = 1500.75;
        boolean isActive = true;
        char initial = 'A';
        byte age = 30;
        short smallNumber = 32000;
        long bigNumber = 10000000000L;
        float temperature = 36.6f;


        String accountNumber = "123456789";
        int[] transactionAmounts = {100, 200, -50};
        ArrayList<String> transactions = new ArrayList<>();
        transactions.add("Deposito");

        // Mutables
        StringBuilder account = new StringBuilder("123456");
        account.append("789");

        // Inmutable
        String account1 = "123456";
        account1 = account1 + "789";  // Crea un nuevo objeto

        // Recoleción de basura
        class GarbageCollectorExample {
            public static void main(String[] args) {
                int numero = 231;
                System.out.println("Acceso Concedido " + numero);
                //  numero = null;      Los primitivos no pueden ser null
                System.gc();
            }
        }

        // Aritméticos
        double newBalance = balance + 200.00; // Depósito

        // Asignación
        balance += 50.00; // Asignación compuesta

        // Operadores lógicos
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso Concedido");
        }

        // Operador Unario
        balance++; // Incremento

        // Operador Ternario
        String status = (balance < 0) ? "Deuda" : "Crédito";

        int maintenanceFee = 5;
        if (balance < 500) {
            balance -= maintenanceFee;
        }

        // Variables básicas
        String accountNumber1 = "123456789";
        double balance1 = 1500.75;
        int pin1 = 1234;

        // Array de montos de transacciones
        int[] transactionAmounts1 = {200, -100, 50};

        // Operaciones con variables
        balance1 += transactionAmounts1[0]; // Depósito
        if (balance1 > 0 && pin1 == 1234) {
            System.out.println("Acceso Concedido2");
        }

        // Uso de operadores
        balance1++; // Incremento
        String status1 = (balance1 < 0) ? "Deuda" : "Crédito";
        System.out.println("Estado de cuenta: " + status1);

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
