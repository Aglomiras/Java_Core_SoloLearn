package org.mpei.WorkSololearn_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practic_1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable task = () -> {
            int result = 1 + 1;
            System.out.println(result);
        };
        executor.submit(task);
    }
}
