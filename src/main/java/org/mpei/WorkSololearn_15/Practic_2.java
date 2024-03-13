package org.mpei.WorkSololearn_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practic_2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int value = i;
            executor.submit(() -> System.out.println(value + ", currentThreadName: "
                    + Thread.currentThread().getName()));
        }
    }
}
