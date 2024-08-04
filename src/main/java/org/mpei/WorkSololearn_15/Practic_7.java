package org.mpei.WorkSololearn_15;

import java.util.concurrent.Executor;

public class Practic_7 {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Task executed");
        Executor executor = (runnable) -> {
            new Thread(runnable).start();
        };
        executor.execute(task);
    }
}
