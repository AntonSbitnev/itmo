package ru.itmo.java.basics.ThreadExample.Task2;
import java.util.concurrent.CountDownLatch;

public class CountProgram {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int numThreads = 100;
        int numIncrementsPerThread = 1000;

        CountDownLatch latch = new CountDownLatch(numThreads);

        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < numIncrementsPerThread; j++) {
                    counter.increment();
                }

                latch.countDown();
            });

            thread.start();
        }

        latch.await();

        System.out.println("После завершения всех потоков count =  " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}