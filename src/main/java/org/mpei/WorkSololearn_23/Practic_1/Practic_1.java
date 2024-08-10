package org.mpei.WorkSololearn_23.Practic_1;

import static java.lang.Thread.currentThread;
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;

public class Practic_1 {
    public static void main(String[] args) {
        //Экземпляр  класса генератора
        final EvenNumberGenerator generator = new EvenNumberGenerator();

        //Количество итераций внутри одного потока
        final int taskGenerationCounts = 10000;
        //Генерация 10000 четных значений
        final Runnable generatorTask = () -> range(0, taskGenerationCounts).forEach(i -> generator.generate());

        //Количество потоков в пуле
        final int amountOfGenerationThreads = 5;
        //Создание массива потоков
        final Thread[] generatorThreads = createThreads(generatorTask, amountOfGenerationThreads);

        //Запуск всех потоков
        startThreads(generatorThreads);
        //Ждем остановку всех потоков
        waitUntilFinish(generatorThreads);

        //Ожидаемое значение
        final int expectedGenerationCount = amountOfGenerationThreads * taskGenerationCounts * 5;
        //Возвращаем то значение, которое лежит в классе генератора
        final int actualGeneratorValue = generator.getValue();

        //Проверка на то, что ожидаемое значение не равно тому, которое у нас в итоге получилось
        if (expectedGenerationCount != actualGeneratorValue) {
            throw new RuntimeException(
                    "Expected generation " + expectedGenerationCount + " but got " + actualGeneratorValue
            );
        }

    }

    //Создание массива класса threads (создаем массив потоков, условно пул потоков)
    private static Thread[] createThreads(final Runnable task, final int amountOfThreads) {
        return range(0, amountOfThreads)
                .mapToObj(i -> new Thread(task))
                .toArray(Thread[]::new);
    }

    //Запуск потоков из массива потоков
    private static void startThreads(final Thread[] threads) {
        stream(threads).forEach(Thread::start);
    }

    //Метод по остановке всех потоков
    private static void waitUntilFinish(final Thread thread) {
        try {
            thread.join();
        } catch (final InterruptedException exception) {
            currentThread().interrupt();
        }
    }

    //Метод по ожиданию конца работы всех потоков
    private static void waitUntilFinish(final Thread[] threads) {
        stream(threads).forEach(Practic_1::waitUntilFinish);
    }
}
