package ru.itmo.java.basics.lesson4;
import java.util.Scanner;
public class SumNumbers {


    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int num3 = scanner.nextInt();

            boolean result = checkSum(num1, num2, num3);
            System.out.println("Результат: " + result);
        }

        public static boolean checkSum(int num1, int num2, int num3) {
            int sum = num1 + num2;
            return sum == num3;
        }
    }
}
