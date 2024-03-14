package org.mpei.WorkSololearn_18;

public class Practic_2 {
    private Object lock = new Object();
    private int count = 0;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Practic_2 test = new Practic_2();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count = " + test.getCount()); // Выведе 20000
    }
}
