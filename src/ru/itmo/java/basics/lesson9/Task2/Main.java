package ru.itmo.java.basics.lesson9.Task2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;
        System.out.println("Time taken to add 1000000 elements to ArrayList: " + arrayListTime + " наносекунд");

        startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;
        System.out.println("Time taken to add 1000000 elements to LinkedList:  " + linkedListTime + " nanoseconds");

        System.out.println();

        selectRandomElements(arrayList, 100000);
        selectRandomElements(linkedList, 100000);
    }

    public static void selectRandomElements(List<Integer> list, int numElements) {
        Random random = new Random();
        long startTime = System.nanoTime();

        for (int i = 0; i < numElements; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }

        long endTime = System.nanoTime();
        long selectionTime = endTime - startTime;
        System.out.println("Time taken to select " + numElements + " random elements from " +
                list.getClass().getSimpleName() + ": " + selectionTime + " nanoseconds");
    }
}
