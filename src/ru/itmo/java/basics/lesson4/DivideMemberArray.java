package ru.itmo.java.basics.lesson4;

public class DivideMemberArray {
    public static class Main {
        public static void main(String[] args) {
            int[] array = {99, -3, 17, 89, 5, 4, 21};

            boolean isFirstOrLast = (array[0] == 3 || array[array.length - 1] == 3);

            System.out.println("array = 99, -3, 17, 89, 5, 4, 21");
            System.out.println(isFirstOrLast);
        }
    }

}
