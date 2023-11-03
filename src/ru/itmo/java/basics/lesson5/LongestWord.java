package ru.itmo.java.basics.lesson5;

public class LongestWord {
    public static class Main {
        public static String findLongestWord(String text) {
            String[] words = text.split("\\s+");
            String longestWord = "";

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            return longestWord;
        }

        public static void main(String[] args) {
            String text = "Как уже неоднократно упомянуто, явные признаки победы институционализации представляют собой не что иное, как квинтэссенцию победы маркетинга над разумом и должны быть рассмотрены исключительно в разрезе маркетинговых и финансовых предпосылок. Господа, высокое качество позиционных исследований напрямую зависит от инновационных методов управления процессами.";
            String longestWord = findLongestWord(text);

            System.out.println("Самое длинное слово в тексте: " + longestWord);
        }
    }
}
