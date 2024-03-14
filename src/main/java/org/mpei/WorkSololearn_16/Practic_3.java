package org.mpei.WorkSololearn_16;

public class Practic_3 {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Practic_3 test = new Practic_3();

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

        System.out.println("count = " + test.getCount());

        /**
         * Резюме: если новое значение переменной вычисляется на основе предыдущего или на основе
         * других переменных, потоки могут перетереть изменения друг друга
         * */
    }
}
