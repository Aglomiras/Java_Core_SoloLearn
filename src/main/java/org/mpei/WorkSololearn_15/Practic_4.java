package org.mpei.WorkSololearn_15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practic_4 {
    /**Создает только один поток*/
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            final int value = i;
            executor.submit(() -> System.out.println(value + " " + Thread.currentThread().getName()));
            //Выведет: 0, 1, 2, 3, 4
        }
    }
}
