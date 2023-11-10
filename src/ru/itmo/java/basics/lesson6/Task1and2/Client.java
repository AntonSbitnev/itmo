package ru.itmo.java.basics.lesson6.Task1and2;

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
