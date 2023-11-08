package ru.itmo.java.basics.lesson6.Task3;

public class Main {
    public static void main(String[] args) {
        TruckExtendsCar.Truck truck = new TruckExtendsCar.Truck(12000, "Volvo", 'B', 120.5f, 18, 40000.0);
        truck.outPut();
        truck.newWheels(20);
    }
}
