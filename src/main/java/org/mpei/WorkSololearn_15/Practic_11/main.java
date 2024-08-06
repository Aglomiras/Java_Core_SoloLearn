package org.mpei.WorkSololearn_15.Practic_11;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class main {
    /**
     * Метод newScheduledThreadPool() создает пул потоков, который может планировать выполнение задач после заданной
     * задержки или через регулярные промежутки времени. Этот метод возвращает ScheduledExecutorService.
     * Существует три метода для планирования задач в таком пуле потоков: schedule(), scheduleAtFixedRate() и
     * scheduleWithFixedDelay(). Рассмотрим пример реализации пула потоков с помощью метода schedule().
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current Time = " + new Date());

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 3; i++) {
            Thread.sleep(2000);
            Runnable runnable = new RunnableTask("Task " + i);
            scheduledExecutorService.schedule(runnable, 3, TimeUnit.SECONDS);
        }

        Thread.sleep(5000);
        scheduledExecutorService.shutdown();

        System.out.println("Completed all threads");
    }
    /**
     * Как видно из примера:
     * 1) Метод schedule принимает три аргумента: задачу, задержку и промежуток времени задержки.
     * 2) Метод schedule() используется для планирования задачи после фиксированной задержки.
     * 3) Метод scheduleAtFixedRate() используется для планирования задачи после фиксированной задержки и последующего
     * периодического выполнения этой задачи.
     * 4) Метод scheduleWithFixedDelay() используется для планирования задачи после начальной задержки, а затем выполнения
     * задач с фиксированной задержкой после завершения предыдущей задачи.
     *
     * Каждый из этих методов полезен в своём определённом сценариев.
     * */
}
