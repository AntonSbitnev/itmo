package ru.itmo.java.basics.lesson10.Task4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


import static ru.itmo.java.basics.lesson10.Task1and2and3.TextFileManager.readTextFile;
public class FileCharReplacement {
   public static void replaceChar() {
        String inputFile = "files/MergedFile.txt";
        String outputFile = "files/ModifiedFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                if (Character.isLetterOrDigit(character)) {
                    writer.write(character);
                } else {
                    writer.write('$');
                }
            }

            System.out.println("Замена символов успешно выполнена.");

        } catch (IOException e) {
            System.err.println("Something wrong" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        replaceChar();

        List<String> lines = readTextFile("files/MergedFile.txt");
        System.out.println("Содержимое объединенного файла:");
        for (String line : lines) {
            System.out.println(line);
        }
        List<String> lines2 = readTextFile("files/ModifiedFile.txt");
        System.out.println("Содержимое модифицированного файла:");
        for (String line : lines2) {
            System.out.println(line);
        }

    }

}