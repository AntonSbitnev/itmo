package ru.itmo.java.basics.lesson6;

import java.util.Scanner;
public class UserSubUser {

    static abstract class User {
        public int getAge() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ваш возраст: ");
            return scanner.nextInt();
        }
        public abstract String getName();
    }

    static class SubUser extends User {
        @Override
        public String getName() {
            System.out.print("Введите ваше имя: ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }
    }

    public static class Main {
        public static void main(String[] args) {
            SubUser user = new SubUser();
            int age = user.getAge();
            String name = user.getName();

            System.out.println("Ваш возраст: " + age);
            System.out.println("Ваше имя: " + name);
        }
    }
}





