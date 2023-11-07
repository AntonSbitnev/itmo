package ru.itmo.java.basics.lesson6;

public class TruckExtendsCar {

    public static class Truck extends Car {
        private int numberOfWheels;
        private final double maxWeight;

        public Truck(int weight, String model, char color, float speed, int numberOfWheels, double maxWeight) {
            super(weight, model, color, speed);
            this.numberOfWheels = numberOfWheels;
            this.maxWeight = maxWeight;
        }

        public void newWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
            System.out.println("Количество колес у грузовика установлено в " + numberOfWheels);
        }

        public void outPut() {
            super.outPut();
            System.out.println("Грузовик имеет " + numberOfWheels + " колес");
            System.out.println("Максимальный вес грузовика: " + maxWeight + " кг");
        }
        public static void main(String[] args) {
            Truck truck = new Truck(12000, "Volvo", 'B', 120.5f, 18, 40000.0);
            truck.outPut();
            truck.newWheels(20);
        }
    }

}
