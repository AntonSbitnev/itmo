package ru.itmo.java.basics.lesson4;

public class UniqueNumber {
    public static class Main {
        public static void main(String[] args) {
            int[] array = {11, 222, 43, 11, 222, 84};
            int firstUnique = findFirstUnique(array);

            System.out.println("Первое уникальное число: " + firstUnique);
        }

        public static int findFirstUnique(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int num = array[i];
                boolean isUnique = true;

                for (int j = 0; j < array.length; j++) {
                    if (i != j && num == array[j]) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    return num;
                }
            }

            return -1;
        }
    }
}