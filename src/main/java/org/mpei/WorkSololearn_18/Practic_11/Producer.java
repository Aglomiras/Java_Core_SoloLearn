package org.mpei.WorkSololearn_18.Practic_11;

import java.util.Queue;

public class Producer implements Runnable {
    //Буфер
    private final Queue<Double> doubleQueue;
    //Размер буфера
    private final int sizeQueue;

    //Конструктор
    public Producer(Queue<Double> doubleQueue, int sizeQueue) {
        this.doubleQueue = doubleQueue;
        this.sizeQueue = sizeQueue;
    }

    //Основной метод по выводу записанных в буфер значений
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Produced: " + producProd());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double producProd() throws InterruptedException {
        synchronized (doubleQueue) {
            if (doubleQueue.size() == sizeQueue) {
                doubleQueue.wait();
                System.out.println("Жду!"); //Вывод в консоль, если буфер полон
            }
            //Создаем число, которое будет записано в буфер
            double val = Math.random();
            //Добавляем число в буфер
            doubleQueue.add(val);

            doubleQueue.notifyAll();

            return val;
        }
    }
}
