package ru.itmo.java.basics.lesson4;
import java.util.Scanner;


public class ArrayLength {

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Array length: ");
            int length = scanner.nextInt();

            int[] arr = new int[length];

            System.out.println("Numbers of array:");
            for (int i = 0; i < length; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.print("Result: [");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]);
                if (i < length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            scanner.close();
        }
    }
}

