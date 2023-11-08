package ru.itmo.java.basics.lesson6.Task5;

import ru.itmo.java.basics.lesson6.Task5.User;

public class SubUser extends User {
    public static String name;

    public SubUser() {
        name = setName();
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + name);
    }
}