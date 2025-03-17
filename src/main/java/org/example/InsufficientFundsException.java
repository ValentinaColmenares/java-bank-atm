package org.example;

/*public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String errorMessage) {
        super(errorMessage);
    }
}

public void performTransaction(String accountNumber, Transaction.TransactionType type, double amount) {
    try {
        if (type == Transaction.TransactionType.WITHDRAWAL) {
            accounts.get(accountNumber).withdraw(amount);
            System.out.println("Retiro exitoso");
        }
    } catch (InsufficientFundsException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        // Registro de la transacción
    }
}*/

/*public void readFile(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }
}
*/

// Clase 14.

/*// Ejemplo de Checked Exception
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ATMConfigLoader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("config.txt"));
            String line = reader.readLine();
            System.out.println("Configuración: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error de I/O: " + e.getMessage());
        }
    }
}*/


/* public class InvalidAccountException extends RuntimeException {
    public InvalidAccountException(String message) {
        super(message);
    }
}*/


/*public class Account {
    private double balance;

    public void transferFunds(String targetAccountNumber, double amount)
            throws InsufficientFundsException, InvalidAccountException {
        if (balance < amount) {
            throw new InsufficientFundsException("Fondos insuficientes");
        }
        if (!Bank.isValidAccount(targetAccountNumber)) {
            throw new InvalidAccountException("Cuenta destino no válida");
        }
        balance -= amount;
        Bank.getAccount(targetAccountNumber).deposit(amount);
    }
}
*/

/*public class ATM {
    private Map<String, Account> accounts;

    public ATM() {
        accounts = new HashMap<>();
    }

    public void performTransfer(String sourceAccountNumber, String targetAccountNumber, double amount) {
        try {
            accounts.get(sourceAccountNumber).transferFunds(targetAccountNumber, amount);
            System.out.println("Transferencia exitosa");
        } catch (InsufficientFundsException | InvalidAccountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Registro de la transacción
        }
    }
}
*/
