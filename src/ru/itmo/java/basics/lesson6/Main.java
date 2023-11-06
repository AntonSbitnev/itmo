package ru.itmo.java.basics.lesson6;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Alex", "Cross", "GiveMeYourMoney");
        BankEmployee employee = new BankEmployee("Anna", "Bad", "GiveMeYourMoney");

        client.printInfo();
        employee.printInfo();
    }
}
