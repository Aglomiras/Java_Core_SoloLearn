package org.mpei.WorkSololearn_15.Practic_8;

public class MyRunnable implements Runnable {
    private final String task;

    public MyRunnable(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Executing " + task + " with " +
                    Thread.currentThread().getName());
        }
        System.out.println();
    }
}
