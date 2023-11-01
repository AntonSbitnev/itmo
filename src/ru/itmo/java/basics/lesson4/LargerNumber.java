package ru.itmo.java.basics.lesson4;
import java.util.Scanner;
public class LargerNumber {


    public static class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            System.out.print("Введите третье число: ");
            int thirdNumber = scanner.nextInt();

            boolean result = (secondNumber > firstNumber) && (thirdNumber > secondNumber);

            System.out.println("Результат: " + result);
        }
    }
}
