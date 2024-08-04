package org.mpei.WorkSololearn_20;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

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
        FutureTask<String> futureTask = new FutureTask<>(task);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

        /**
         * Как видно из примера, мы получаем при помощи метода get результат из задачи task.
         * Важно, что в момент получения результата при помощи метода get выполнение становится
         * синхронным. Как вы думаете, какой механизм тут будет использован? Правильно,
         * нет блока синхронизации — поэтому WAITING в JVisualVM мы увидим не как monitor или wait,
         * а как тот самый park (т.к. используется механизм LockSupport).
         * */
    }
}
