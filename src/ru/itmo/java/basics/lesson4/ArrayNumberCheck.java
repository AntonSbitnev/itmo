package ru.itmo.java.basics.lesson4;

public class ArrayNumberCheck {
    public static class Main {
        public static void main(String[] args) {
            int[] array = {2, 47, 6, 66, 8, 13, 77, 987};

            boolean contains1or3 = false;

            for (int number : array) {
                if (number == 1 || number == 3) {
                    contains1or3 = true;
                    break;
                }
            }

            if (contains1or3) {
                System.out.println("Массив содержит число 1 или 3.");
            } else {
                System.out.println("Массив не содержит число 1 или 3.");
            }
        }
    }
}
