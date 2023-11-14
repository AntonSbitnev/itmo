package ru.itmo.java.basics.lesson9.Task1;
import java.util.*;

public class RemoveDuplicate {

    public static <T> Collection<T> removeDuplicates(Collection<T> inputCollection) {
        Set<T> uniqueSet = new LinkedHashSet<>(inputCollection);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        System.out.println("Исходная коллекция: " + inputList);

        Collection<String> resultCollection = removeDuplicates(inputList);
        System.out.println("Коллекция без дубликатов: " + resultCollection);
    }
}
