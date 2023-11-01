package ru.itmo.java.basics.lesson4;

public class DivideNumbers {
    public static class Main {
        public static void main(String[] args) {
            System.out.println("Делится на 3:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    System.out.println(i);
                }
            }

            System.out.println("Делится на 5:");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0 && i % 3 != 0) {
                    System.out.println(i);
                }
            }

            System.out.println("Делится на 3 и на 5:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
