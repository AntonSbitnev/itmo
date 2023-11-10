package ru.itmo.java.basics.lesson6.Task5;

import java.util.Scanner;


public class User {
    public int age;
    public User() {
    }

    public String setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        return scanner.next();
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println("Возраст: " + age);
    }
}

