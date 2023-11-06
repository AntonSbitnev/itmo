package ru.itmo.java.basics.lesson6;

public interface InfoPrinter {
        void printInfo();
    }

    class Client implements InfoPrinter {
        private final String firstName;
        private final String lastName;
        private final String bankName;

        public Client(String firstName, String lastName, String bankName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.bankName = bankName;
        }

        @Override
        public void printInfo() {
            System.out.println("Клиент: " + firstName + " " + lastName);
            System.out.println("Банк: " + bankName);
        }
    }

    class BankEmployee implements InfoPrinter {
        private final String firstName;
        private final String lastName;
        private final String bankName;

        public BankEmployee(String firstName, String lastName, String bankName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.bankName = bankName;
        }

        @Override
        public void printInfo() {
            System.out.println("Работник банка: " + firstName + " " + lastName);
            System.out.println("Банк: " + bankName);
        }
    }

