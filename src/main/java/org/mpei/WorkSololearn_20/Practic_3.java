package org.mpei.WorkSololearn_20;

import org.mpei.WorkSololearn_20.Practic_2.NewsService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Practic_3 {
    /**
     * Мы можем объединять результат CompletableFuture с результатом другого CompletableFuture
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier newsSupplier = () -> NewsService.getMessage();

        CompletableFuture<String> reader = CompletableFuture.supplyAsync(newsSupplier);
        CompletableFuture.completedFuture("!!")
                .thenCombine(reader, (a, b) -> b + a)
//                .thenCombine(reader, (a, b) -> a + b)
                .thenAccept(result -> System.out.println(result))
                .get();
        /**
         * Тут стоить обратить внимание, что по умолчанию потоки будут демон-потоками, поэтому
         * для наглядности мы используем get, чтобы дождаться результат.
         * */

        CompletableFuture.completedFuture(2L)
                .thenCompose((val) -> CompletableFuture.completedFuture(val + 2))
                .thenAccept(result -> System.out.println(result));

        /**
         * Тут хочется отметить, что для краткости использован метод CompletableFuture.completedFuture.
         * Данный метод не создаёт новый поток, поэтому остальная цепочка будет выполнена в том же потоке,
         * в котором был вызван completedFuture. Также есть метод thenAcceptBoth. Он очень похож на accept,
         * но если thenAccept принимает consumer, то thenAcceptBoth принимает на вход ещё один
         * CompletableStage + BiConsumer, то есть consumer, который на вход принимает 2 источника, а не один.
         *
         * Есть ещё интересная возможность со словом Either. Данные методы принимают альтернативный CompletableStage
         * и будут выполнены на том CompletableStage, который первее выполнится.
         *
         * И закончить этот обзор хочется ещё одной интересной возможностью CompletableFuture — обработкой ошибок.
         * */

        CompletableFuture.completedFuture(2L)
                .thenApply((a) -> {
                    throw new IllegalStateException("error");
                }).thenApply((a) -> 3L)
//                .exceptionally(ex -> 0L)
                .thenAccept(val -> System.out.println(val));

        /**
         * Данный код ничего не сделает, т.к. упадёт исключение и ничего не будет.
         * Но если мы раскомментируем exceptionally, то мы определим поведение.
         * */
    }
}
