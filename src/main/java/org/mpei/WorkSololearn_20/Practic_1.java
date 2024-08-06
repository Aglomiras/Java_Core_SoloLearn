package org.mpei.WorkSololearn_20;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;

public class Practic_1 {
    public static void main(String[] args) {
        AtomicLong longValue = new AtomicLong(0);
        Runnable task = () -> longValue.set(new Date().getTime());
        Function<Long, Date> dateConverter = (longvalue) -> new Date(longvalue);
        Consumer<Date> printer = date -> {
            System.out.println(date);
            System.out.flush();
        };
        // CompletableFuture computation
        CompletableFuture.runAsync(task)
                .thenApply((v) -> longValue.get())
                .thenApply(dateConverter)
                .thenAccept(printer);
    }
    /**
     * У методов thenRun, thenApply и thenAccept есть версии Async. Это значит, что эти стадии будут выполнены
     * в новом потоке. Он будет взят из особого пула, поэтому заранее неизвестно, какой поток будет, новый или прежний.
     * Всё зависит от того, на сколько тяжёлые задачи.
     * */
}
