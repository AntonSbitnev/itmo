package ru.itmo.java.basics.lesson5;

    public class ReverseWords {

        public static String reverseWords(String input) {
            if (input == null || input.isEmpty()) {
                return "";
            }

            String[] words = input.split(" ");
            StringBuilder reversed = new StringBuilder();

            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                reversed.append(reversedWord).append(" ");
            }

            return reversed.toString().trim();
        }

        public static void main(String[] args) {
            String inputString = "В этом предложении все слова будут написаны задом наперед";
            System.out.println("Исходная строка:\n" + inputString);
            System.out.println("Строка с перевернутыми словами:");
            System.out.println(reverseWords(inputString));
        }
    }

