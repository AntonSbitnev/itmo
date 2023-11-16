package ru.itmo.java.basics.lesson10.Task1and2and3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileManager {

    public static List<String> readTextFile(String fileName) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
           System.err.println("Something wrong" + e.getMessage());
        }

       return lines;
    }

    public static void writeTextFile(String fileName, String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/TextFile.txt", true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Something wrong" + e.getMessage());
        }
    }

    public static void joinTextFiles(String file1, String file2, String mergedFile) {
        List<String> lines1 = readTextFile(file1);
        List<String> lines2 = readTextFile(file2);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String line : lines1) {
                writer.write(line);
                writer.newLine();
            }
            for (String line : lines2) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Something wrong" + e.getMessage());
        }

    }

    public static void main(String[] args) {

        List<String> lines = readTextFile("files/TextFile.txt");
        System.out.println("Содержимое файла:");
        for (String line : lines) {
            System.out.println(line);
        }

        writeTextFile("files/TextFile1.txt", "Вот кот,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.\n" +
                "Вот пёс без хвоста,\n" +
                "Который за шиворот треплет кота,\n" +
                "Который пугает и ловит синицу,\n" +
                "Которая часто ворует пшеницу,\n" +
                "Которая в тёмном чулане хранится\n" +
                "В доме,\n" +
                "Который построил Джек.");

        joinTextFiles("files/TextFile.txt", "files/TextFile1.txt", "files/MergedFile.txt");

        List<String> lines2 = readTextFile("files/MergedFile.txt");
        System.out.println("Содержимое объединенного файла:");
        for (String line : lines2) {
            System.out.println(line);
        }

    }
}