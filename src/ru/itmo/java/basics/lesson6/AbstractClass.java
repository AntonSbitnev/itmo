package ru.itmo.java.basics.lesson6;

public class AbstractClass {
    abstract static class Human {
        private final String FirstName;
        private final String LastName;

        public Human(String FirstName, String LastName) {
            this.FirstName = FirstName;
            this.LastName = LastName;
        }

        public String getFirstName() {
            return FirstName;
        }

        public String getLastName() {
            return LastName;
        }

        public abstract void PrintInfo();
    }

    static class Client extends Human {
        private final String BankName;

        public Client(String FirstName, String LastName, String BankName) {
            super(FirstName, LastName);
            this.BankName = BankName;
        }

        @Override
        public void PrintInfo() {
            System.out.println("Клиент: " + getFirstName() + " " + getLastName());
            System.out.println("Банк: " + BankName);
        }
    }

    static class BankEmployee extends Human {
        private final String BankName;

        public BankEmployee(String FirstName, String LastName, String BankName) {
            super(FirstName, LastName);
            this.BankName = BankName;
        }

        @Override
        public void PrintInfo() {
            System.out.println("Работник банка: " + getFirstName() + " " + getLastName());
            System.out.println("Банк: " + BankName);
        }


    }

    public static class Main {
        public static void main (String[] args) {
            Client client = new Client("Alex", "Cross", "GiveMeYourMoney");
            BankEmployee employee = new BankEmployee("Anna", "Bad", "GiveMeYourMoney");

            client.PrintInfo();
            employee.PrintInfo();
        }
    }
}
