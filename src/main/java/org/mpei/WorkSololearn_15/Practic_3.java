package org.mpei.WorkSololearn_15;

import java.util.concurrent.*;

public class Practic_3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        Callable<Integer> c = () -> {
            return 12 * 15;
        };

        Future<Integer> res = executor.submit(c); // отправляем задачу в экзекьютор
        Integer value = res.get();                // забираем результат вычислений
        System.out.println(value);
    }
}
