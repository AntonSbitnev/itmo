package ru.itmo.java.basics.lesson4;

public class DivideMemberArray {


    public static class Main {
        public static boolean isFirstOrLast(int[] array) {
            if (array.length >= 2 && (array[0] == 3 || array[array.length - 1] == 3)) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            int[] array = {99, -3, 17, 89, 5, 4, 21};
            boolean result = isFirstOrLast(array);

            System.out.println("array = " + arrayToString(array));
            System.out.println(result);
        }

        public static String arrayToString(int[] array) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i < array.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}