package ru.itmo.java.basics.lesson5;

public class SubstringOccurrences {
    public static class Main {
        public static int countSubstringOccurrences(String text, String substring) {
            int count = 0;
            int index = text.indexOf(substring);
            while (index != -1) {
                count++;
                index = text.indexOf(substring, index + 1);
            }
            return count;
        }

        public static void main(String[] args) {
            String text = "Вот дом,\n" +
                    "Который построил Джек.\n" +
                    "А это пшеница,\n" +
                    "Которая в темном чулане хранится\n" +
                    "В доме,\n" +
                    "Который построил Джек.\n" +
                    "А это веселая птица-синица,\n" +
                    "Которая часто ворует пшеницу,\n" +
                    "Которая в темном чулане хранится\n" +
                    "В доме,\n" +
                    "Который построил Джек.";
            String substring = "Джек";

            int occurrences = countSubstringOccurrences(text, substring);

            System.out.println("Количество вхождений подстроки \"" + substring + "\": " + occurrences);
        }
    }
}
