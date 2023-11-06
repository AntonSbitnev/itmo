package ru.itmo.java.basics.lesson6;

public class TruckExtendsCar {
    public static class Car {
        public int weight;
        public String model;
        public char color;
        public float speed;


        public void outPut () {
            System.out.println("Вес " + model + " составляет " + weight + "кг.");
            System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        }

        public Car (int w, String m, char c, float s) {
            weight = w;
            model = m;
            color = c;
            speed = s;
        }

        public Car () {}
    }

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
