package ru.itmo.java.basics.lesson6.Task4;

    public class ChildClass extends ParentClass {
        public void displayNumber() {
            System.out.println("Переменная из родительского класса: " + getNumber());
        }
    }

