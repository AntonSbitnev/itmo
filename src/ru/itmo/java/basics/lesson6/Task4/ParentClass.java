package ru.itmo.java.basics.lesson6.Task4;

import java.util.Scanner;

    public class ParentClass {
        protected int number;
        public int getNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            number = scanner.nextInt();
            return number;
        }

    }

