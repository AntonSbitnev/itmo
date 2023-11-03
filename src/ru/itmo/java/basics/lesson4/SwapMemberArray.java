package ru.itmo.java.basics.lesson4;

public class SwapMemberArray {
    public static class Main {
        public static void main(String[] args) {
            int[] array = {999, 66, 33, 1};

            System.out.print("Array 1: ");
            printArray(array);

            swapFirstAndLast(array);

            System.out.print("Array 2: ");
            printArray(array);
        }

        public static void swapFirstAndLast(int[] arr) {
            if (arr.length >= 2) {
                int temp = arr[0];
                arr[0] = arr[arr.length - 1];
                arr[arr.length - 1] = temp;
            }
        }

        public static void printArray(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
