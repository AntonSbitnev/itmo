package ru.itmo.java.basics.lesson4;

public class AscendingSort {
    public static class Main {
        public static void main(String[] args) {
            int[] arr = {1, 22, 9, 4, 3}; // Ваш массив

            if (isSortedAscending(arr)) {
                System.out.println("OK");
            } else {
                System.out.println("Please, try again");
            }
        }

        public static boolean isSortedAscending(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }

            return true;
        }
    }
}
