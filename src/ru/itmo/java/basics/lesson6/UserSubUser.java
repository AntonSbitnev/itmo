package ru.itmo.java.basics.lesson6;

import java.util.Scanner;
public class UserSubUser {


    static class User {
        private int age;

        public int getAge() {
            return age;
        }
    }

    static class SubUser extends User {
        @Override
        public String toString() {
            return "Alex Cross";
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();

            User user = new User();
            user.age = age;
            System.out.println("Возраст пользователя: " + user.getAge());

            SubUser subUser = new SubUser();
            System.out.println("Имя пользователя: " + subUser.toString());
        }
    }
}
