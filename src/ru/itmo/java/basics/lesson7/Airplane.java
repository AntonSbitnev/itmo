package ru.itmo.java.basics.lesson7;

public class Airplane {

    public class Wing {
        private final double  weigth;

        public Wing(double weigth) {
            this.weigth = weigth;
        }

        public double showWeigth() {
            return weigth;
        }
    }

    public static void main(String[] args) {

        Airplane airplane1 = new Airplane();
        Wing wing1 = airplane1.new Wing(500.0);

        Airplane airplane2 = new Airplane();
        Wing wing2 = airplane2.new Wing(600.0);

        System.out.println("Вес первого крыла: " + wing1.showWeigth() + " кг");
        System.out.println("Вес второго крыла: " + wing2.showWeigth() + " кг");
    }
}
