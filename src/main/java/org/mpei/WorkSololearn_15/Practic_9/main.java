package org.mpei.WorkSololearn_15.Practic_9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            Runnable runnable = new MyRunnable("Task" + i);
            executorService.execute(runnable);
        }

        executorService.shutdown();
    }
    /**
     * Использован тот же пример, что и в предыдущем случае, только на этот раз - с методом
     * newFixedThreadPool(). Этот метод позволяет создать пул с фиксированным количеством
     * потоков. Таким образом, когда мы отправим пять задач, в коде будет создано три новых
     * потока и будут выполнены три задачи. Остальные две задачи находятся в очереди ожидания.
     * Как только какая-либо задача выполнится потоком, этим же потоком будет выбрана и
     * выполнена следующая задача.
     * */
}
