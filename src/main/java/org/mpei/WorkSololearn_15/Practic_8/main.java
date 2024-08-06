package org.mpei.WorkSololearn_15.Practic_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            Runnable runnable = new MyRunnable("Task" + i);
            executorService.execute(runnable);
        }

        executorService.shutdown();
    }
    /**
     * В данном примере мы отправляем на исполнение пять задач. Но так как применяется метод newSingleThreadExecutor(),
     * будет создан только один новый поток и одновременно будет выполняться только одна задача. Остальные четыре
     * задачи находятся в очереди ожидания. Как только задача выполнится потоком, этот поток тут же выберет и выполнит
     * следующую. Метод shutdown() ожидает завершения выполнения задач, в настоящий момент переданных исполнителю,
     * чтобы завершить его работу. Однако, если вам хочется завершить работу исполнителя без ожидания, используйте
     * вместо этого метод shutdownNow().
     * */
}
