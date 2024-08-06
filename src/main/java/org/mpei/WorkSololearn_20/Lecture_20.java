package org.mpei.WorkSololearn_20;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class Lecture_20 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * java.util.concurrent.Callable
         * Callable - это интерфес похожий на интерфейс Runnable, с тем лишь отличием, что он
         * возвращает результат. Помимо этого, данный интерфейс по умолчанию throws Exception.
         * То есть не требует обработки try-catch.
         * */
        Callable task = () -> {
            return "Hello World";
        };

        /**
         * Но что с ним делать? Зачем нам вообще задача, выполняемая в потоке, которая возвращает
         * результат? Очевидно, что в дальнейшем мы рассчитываем получить результат действий,
         * которые в будущем будут выполнены.
         *
         * Для этого есть интерфейс Future.
         * Future - интерфейс для работы с задачами, результат которых мы планируем получить в будущем.
         * Это могут быть методы получения результата, методы проверки статуса и тд.
         *
         * Для Future нас интересует его реализация java.util.concurrent.FutureTask. То есть это Task,
         * который будет выполнен во Future. Чем эта реализация ещё интересна, так это тем,
         * что она реализует и Runnable.
         * */
        FutureTask<String> futureTask = new FutureTask<String>(task);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

        /**
         * Как видно из примера, мы получаем при помощи метода get результат из задачи task.
         * Важно, что в момент получения результата при помощи метода get выполнение становится
         * синхронным. Как вы думаете, какой механизм тут будет использован? Правильно,
         * нет блока синхронизации — поэтому WAITING в JVisualVM мы увидим не как monitor или wait,
         * а как тот самый park (т.к. используется механизм LockSupport).
         * */

        /**
         * Шло время, и в Java 1.8 появился новый класс, который зовётся CompletableFuture. Он реализует интерфейс
         * Future, то есть наши task будут выполнены в будущем, и мы сможем выполнить get и получить результат.
         * Но ещё он реализует некоторый CompletionStage. Из перевода уже понятно его назначение: это некий этап
         * (Stage) каких-то вычислений.
         * */
        CompletableFuture<String> completableFuture;
        completableFuture = CompletableFuture.completedFuture("Просто значение");
        System.out.println(completableFuture.get());

        CompletableFuture<Void> voidCompletableFuture;
        voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println("run " + Thread.currentThread().getName());
        });
        System.out.println(voidCompletableFuture.get());

        CompletableFuture<String> supplier;
        supplier = CompletableFuture.supplyAsync(() -> {
            System.out.println("supply " + Thread.currentThread().getName());
            return "Значение";
        });
        System.out.println(supplier.get());

        /**
         * Если мы выполним этот код, то увидим, что создание CompletableFuture подразумевает запуск и всей цепочки.
         * Поэтому при некоторой схожести со SteamAPI из Java8 в этом отличие этих подходов.
         * */
        List<String> array = Arrays.asList("one", "two");
        Stream<String> stringStream = array.stream().map(value -> {
            System.out.println("Executed");
            return value.toUpperCase();
        });
        /**
         *  Если запустить этот код, то Executed не отобразится. То есть при создании стрима в Java стрим не
         *  запускается сразу, а ждёт, когда из него захотят значение. А вот CompletableFuture запускает
         *  цепочку на выполнение сразу, не дожидаясь того, что у него попросят посчитанное значение.
         *
         * Итак, у нас есть CompletableFuture. Как же мы можем составить цепочку и какие у нас есть средства?
         *
         * Вспомним про функциональные интерфейсы, о которых мы писали ранее.
         * У нас есть функция (Function), которая принимает А и возвращает Б. Имеет единственный метод — apply (применить).
         * У нас есть потребитель (Consumer), которая принимает А и ничего не возвращает (Void). Имеет единственный метод — accept (принять).
         * У нас есть запускаемый в потоке код Runnable, который не принимает и не возвращает. Имеет единственный метод — run (запустить).
         * Второе, что надо помнить, что CompletalbeFuture в своей работе использует Runnable, потребителей и
         * функции. Учитывая это, вы всегда сможете вспомнить, что с CompletableFuture можно делать так как описано в
         * Practic_1
         * */
    }
}
