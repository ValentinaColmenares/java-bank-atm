package org.example;

// Singleton
/*
public class ConfigManager {
    private static ConfigManager instance;
    private Properties configProperties;

    private ConfigManager() {
        configProperties = new Properties();
        // Load configuration properties
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        return configProperties.getProperty(key);
    }
}*/

// Factory Method

// Patrones Estructurales

    // Patrón Adapter

    /*  public interface PaymentGateway {
            void pay(double amount);
        }

        public class PayPalAdapter implements PaymentGateway {
            private PayPal payPal;

            public PayPalAdapter(PayPal payPal) {
                this.payPal = payPal;
            }

            @Override
            public void pay(double amount) {
                payPal.sendPayment(amount);
            }
        }*/

    // Patrón Composite

    /*  import java.util.ArrayList;
        import java.util.List;

        public interface Transaction {
            void execute();
        }

        public class SimpleTransaction implements Transaction {
            private String description;

            public SimpleTransaction(String description) {
                this.description = description;
            }

            @Override
            public void execute() {
                System.out.println("Executing: " + description);
            }
        }

        public class CompositeTransaction implements Transaction {
            private List<Transaction> transactions = new ArrayList<>();

            public void addTransaction(Transaction transaction) {
                transactions.add(transaction);
            }

            @Override
            public void execute() {
                for (Transaction t : transactions) {
                    t.execute();
                }
            }
        }*/

// Patrones de comportamiento

    // Strategy

    /*  public interface AuthStrategy {
            boolean authenticate(String data);
        }

        public class PinAuthStrategy implements AuthStrategy {
            private String pin;

            public PinAuthStrategy(String pin) {
                this.pin = pin;
            }

            @Override
            public boolean authenticate(String data) {
                return this.pin.equals(data);
            }
        }

        public class BiometricAuthStrategy implements AuthStrategy {
            private String biometricData;

            public BiometricAuthStrategy(String biometricData) {
                this.biometricData = biometricData;
            }

            @Override
            public boolean authenticate(String data) {
                return this.biometricData.equals(data);
            }
        }

        public class ATM {
            private AuthStrategy authStrategy;

            public void setAuthStrategy(AuthStrategy authStrategy) {
                this.authStrategy = authStrategy;
            }

            public boolean authenticateUser(String data) {
                return authStrategy.authenticate(data);
            }
        } */

        // Observer

        /*  import java.util.ArrayList;
            import java.util.List;

            public interface Observer {
                void update(double balance);
            }

            public class SMSNotifier implements Observer {
                @Override
                public void update(double balance) {
                    System.out.println("SMS: Tu saldo es: " + balance);
                }
            }

            public class EmailNotifier implements Observer {
                @Override
                public void update(double balance) {
                    System.out.println("Email: Tu saldo es: " + balance);
                }
            }

            public class Account {
                private List<Observer> observers = new ArrayList<>();
                private double balance;

                public void addObserver(Observer observer) {
                    observers.add(observer);
                }

                public void deposit(double amount) {
                    balance += amount;
                    notifyObservers();
                }

                public void withdraw(double amount) {
                    balance -= amount;
                    notifyObservers();
                }

                private void notifyObservers() {
                    for (Observer observer : observers) {
                        observer.update(balance);
                    }
                }
            } */