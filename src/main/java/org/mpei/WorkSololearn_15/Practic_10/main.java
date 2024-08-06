package org.mpei.WorkSololearn_15.Practic_10;

import org.mpei.WorkSololearn_15.Practic_9.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            Runnable runnable = new MyRunnable("Task" + i);
            executorService.execute(runnable);
        }

        executorService.shutdown();
    }
    /**
     * В данном примере метод newCachedThreadPool() изначально создаст пять новых потоков и обработает пять задач.
     * Никакой очереди ожидания здесь не будет. Если поток остается в бездействии более минуты, метод устраняет его.
     * Таким образом, этот метод - хороший выбор, если вам хочется добиться большей производительности очереди,
     * чем это возможно с методом newFixedThreadPool(). Но если вы хотите ограничить количество параллельно выполняемых
     * задач во имя управления ресурсами, лучше использовать newFixedThreadPool().
     * */
}
