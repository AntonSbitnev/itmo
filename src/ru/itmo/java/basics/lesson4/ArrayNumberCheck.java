package ru.itmo.java.basics.lesson4;

public class ArrayNumberCheck {
    public static class Main {
        public static boolean Contains1Or3(int[] arr) {
            for (int number : arr) {
                if (number == 1 || number == 3) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {24, 61, 191, 555, 582, 777};
            boolean result = Contains1Or3(arr);

            if (result) {
                System.out.println("Массив содержит число 1 или 3.");
            } else {
                System.out.println("Массив не содержит число 1 или 3.");
            }
        }
    }
}
