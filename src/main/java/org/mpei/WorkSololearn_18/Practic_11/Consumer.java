package org.mpei.WorkSololearn_18.Practic_11;

import java.util.Queue;

public class Consumer implements Runnable {
    //Буфер
    private final Queue<Double> doubleQueue;
    //Конструктор
    public Consumer(Queue<Double> doubleQueue) {
        this.doubleQueue = doubleQueue;
    }
    //основной метод, по выводу зпрочитанных значений
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumer: " + consumerCons());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //Считывание значений с буфера
    public Double consumerCons() throws InterruptedException {
        synchronized (doubleQueue) {
            if (doubleQueue.isEmpty()) {
                doubleQueue.wait();
            }

            doubleQueue.notifyAll();
            return doubleQueue.poll();
        }
    }
}
