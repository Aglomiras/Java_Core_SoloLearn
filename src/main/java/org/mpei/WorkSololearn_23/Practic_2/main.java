package org.mpei.WorkSololearn_23.Practic_2;

import static java.lang.Thread.currentThread;
import static java.util.Arrays.stream;

public class main {
    public static void main(String[] args) {
        /**Экземпляр класса по увеличению перемнной*/
        GeneratorAdd10 atomicGenerator = new GeneratorAdd10();

        /**Количество итераций по увеличению переменной*/
        int CONSTANT_TASK = 10000;

        /**Задача*/
        Runnable taskGenerator = () -> {
            for (int i = 0; i < CONSTANT_TASK; i++) {
                atomicGenerator.generateAdd10();
            }
        };

        /**Количество потоков*/
        int CONSTANT_THREADS = 5;

        /**Создание массива из 5 потоков*/
        Thread[] threads = createThreads(taskGenerator, CONSTANT_THREADS);

        startThreads(threads);
        finisThreads(threads);

        int expectedValue = CONSTANT_TASK * CONSTANT_THREADS * 10;
        int actualValue = atomicGenerator.getAtomicIntegerValue();

        if (actualValue != expectedValue) {
            throw new RuntimeException("Wrong atomic value\n" +
                    "Expected generation " + expectedValue + " but got " + actualValue);
        } else {
            System.out.println("Success" +
                    "Expected = " + expectedValue + " = " + "actual = " + actualValue);
        }
    }

    public static Thread[] createThreads(Runnable runnable, int numThreads) {
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(runnable);
        }
        return threads;
    }

    public static void startThreads(Thread[] threads) {
        stream(threads).forEach(Thread::start);
    }

    public static void finisThreads(Thread[] threads) {
        stream(threads).forEach(main::waitFinishThreads);
    }

    public static void waitFinishThreads(Thread thread) {
        try {
            thread.join();
        } catch (final InterruptedException exception) {
            currentThread().interrupt();
        }
    }
}
