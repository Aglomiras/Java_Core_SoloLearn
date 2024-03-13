package org.mpei.WorkSololearn_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practic_5 {
    /**Использование пула с фиксированным колчиеством потоков*/
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            executor.submit(() -> longTask());
        }
    }

    public static void longTask() {
        int i = 0;
        while (i < 10000) {
            System.out.println(i);
            i++;
        }
    }
}
