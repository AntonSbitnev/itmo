package ru.itmo.java.basics.ThreadExample.Task3;

class MyThread implements Runnable {
    private String name;
    private final Object lock;

    public MyThread(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                System.out.println(name);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.err.println("Something wrong " + e.getMessage());
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(new MyThread("Поток 1", lock));
        Thread thread2 = new Thread(new MyThread("Поток 2", lock));

        thread1.start();
        thread2.start();
    }
}