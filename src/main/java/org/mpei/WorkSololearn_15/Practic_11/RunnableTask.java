package org.mpei.WorkSololearn_15.Practic_11;

import java.util.Date;

public class RunnableTask implements Runnable {
    private final String task;

    public RunnableTask(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start Time for  " + task + " " +
                new Date());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " End Time for " + task + " " +
                new Date());
    }

    @Override
    public String toString() {
        return this.task;
    }
}
