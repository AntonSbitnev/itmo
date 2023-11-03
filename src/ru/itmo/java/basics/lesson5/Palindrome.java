package ru.itmo.java.basics.lesson5;

public class Palindrome {
    public static class Main {
        public static boolean isPalindrome(String word) {

            word = word.replaceAll("\\s", "").toLowerCase();
            int length = word.length();

            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            String word1 = "Доход";
            String word2 = "Привет";

            System.out.println(word1 + " - Палиндром? " + isPalindrome(word1));
            System.out.println(word2 + " - Палиндром? " + isPalindrome(word2));
        }
    }
}
