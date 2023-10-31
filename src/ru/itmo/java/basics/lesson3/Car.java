package ru.itmo.java.basics.lesson3;

public class Car {
    private String color;
    private String name;
    private double weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public void printCarDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Color: " + color);
        System.out.println("Car Weight: " + weight + " kg");
    }

    public static void main(String[] args) {

        Car car1 = new Car("Red");
        car1.name = "Ferrari";
        car1.weight = 1500.0;

        Car car2 = new Car("Blue", 1800.0);
        car2.name = "Thunderbird";

        System.out.println("Car 1 Details:");
        car1.printCarDetails();

        System.out.println("\nCar 2 Details:");
        car2.printCarDetails();
    }
}