package org.mpei.WorkSololearn_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practic_6 {
    /**Сколько потоков будут в работе?*/
    public static void main(String[] args) {
        ExecutorService cached = Executors.newCachedThreadPool();
        ExecutorService fixed  = Executors.newFixedThreadPool(4);
        ExecutorService single = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            cached.submit(() -> longTask());
            fixed.submit(() -> longTask());
            single.submit(() -> longTask());
        }
        //15 потоков будут запущены (при условии, что выполняемая задача будет долгая)
    }

    public static void longTask() {
        int i = 0;
        while (i < 1) {
            System.out.println(i + ", currentThreadName: " + Thread.currentThread().getName());
            i++;
        }
    }
}
