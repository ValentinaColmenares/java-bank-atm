package org.example;

public class FlujosDeControl {

    public static boolean authenticateUser(String inputPin) {
        int pin = 1234;
        int attempts = 0;
        while (attempts < 3) {
            if (String.valueOf(pin).equals(inputPin)) {
                System.out.println("Acceso concedido");
                return true;
            } else {
                attempts++;
                System.out.println("PIN incorrecto. Intento " + attempts + " de 3.");
            }
        }
        return false;
    }

    public static void main(String[] args) {

        byte age = 30;

        // Lógica booleana
        boolean hasValidID = true;
        boolean isAdmin = false;
        boolean isValidUser = age > 18 && hasValidID;
        boolean canAccessAccount = isValidUser || isAdmin;

        // Switch
        /*public void displayMenu() {
            System.out.println("Opciones del ATM:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("3. Trasferencias internacionales");  TODO

            public boolean wire(String otherAccount, int ammount) {
                int wireFees = 30;
                if (authenticateUser() && checkBalance() > ammount) {
                    if (otherAccountExist()) {
                      this.balance -= ammount + wireFees;
                       System.out.println("We'll see how to let account " + otherAccount + " get the money, meanwhile cross your fingers!" )
                       } else {
                       System.out.println("The account" + otherAccount + " doesn't exist, please check that out!"
                       } else {
                       System.out.println("Or you aren't who you say you are, or you don´t have enough funds in your account. Either way, I'm not going to send any money neither bother to check what's the problem. TRANSACTION DENIED!");
                       }
                }
            }

            System.out.println("Selecciona una opción:");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } */

        // for
        for (int i = 0; i < 5; i++) {
            System.out.println("Intento #" + (i + 1));
        }

        // while
        int attempts = 0;
        while (attempts < 3) {
            System.out.println("Introduce tu PIN:");
            attempts++;
        }

        // do-while
        int attempts1 = 0;
        do {
            System.out.println("2Introduce tu PIN:");
            attempts1++;
        } while (attempts1 < 3);

        String inputPin = "1234";
        authenticateUser(inputPin);

    }
}