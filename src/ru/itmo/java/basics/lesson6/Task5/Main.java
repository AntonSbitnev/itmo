package ru.itmo.java.basics.lesson6.Task5;

public class Main {

        public static void main(String[] args) {
            User subUser = new SubUser();
            User user = new User();
            user.setAge();
            subUser.printInfo();
            user.printInfo();
        }
    }


