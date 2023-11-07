package ru.itmo.java.basics.lesson6;
import java.util.Scanner;
public class ParentChild {

        static class ParentClass {
            protected int number;
            public int getNumber() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите целое число: ");
                number = scanner.nextInt();
                return number;
            }

        }

        static class ChildClass extends ParentClass {
            public void displayNumber() {
                System.out.println("Переменная из родительского класса: " + getNumber());
            }
        }

        public static class Main {
            public static void main(String[] args) {
                ChildClass child = new ChildClass();
                child.displayNumber();
            }
        }
}