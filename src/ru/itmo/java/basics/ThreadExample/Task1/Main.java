package ru.itmo.java.basics.ThreadExample.Task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new NumberPrinter(i));
            System.out.println("Поток " + i + " перед запуском: " + thread.getState());
            thread.start();
            System.out.println("Поток " + i + " после запуска: " + thread.getState());
        }
    }

    static class NumberPrinter implements Runnable {
        private final int threadNumber;

        public NumberPrinter(int threadNumber) {
            this.threadNumber = threadNumber;
        }

        @Override
        public void run() {
            System.out.println("Поток " + threadNumber + " во время выполнения: " + Thread.currentThread().getState());
            for (int j = 0; j <= 100; j++) {
                System.out.println("Поток " + threadNumber + ": " + j);
            }
        }
    }
}