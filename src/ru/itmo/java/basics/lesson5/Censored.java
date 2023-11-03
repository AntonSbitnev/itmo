package ru.itmo.java.basics.lesson5;

public class Censored {
    public static class Main {
        public static String censorWord(String text) {
            text = text.replaceAll("\\bБяка\\b", "[вырезано цензурой]");
            return text;
        }

        public static void main(String[] args) {
            String originalText = "Встретились Бяка и Бука.\n" +
                    "Никто не издал ни звука.\n" +
                    "Никто не подал и знака —\n" +
                    "Молчали Бука и Бяка.\n" +
                    "И Бука\n" +
                    "Думал со скукой:\n" +
                    "«Чего он так смотрит — букой?»\n" +
                    "А Бяка думал:\n" +
                    "«Однако\n" +
                    "Какой он ужасный\n" +
                    "Бяка…";
            String censoredText = censorWord(originalText);

            System.out.println("Исходный текст: " + originalText);
            System.out.println("Цензурированный текст: " + censoredText);
        }
    }
}

