package org.mpei.WorkSololearn_18;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Practic_6 {
    /**
     * Тестовый вопрос №1:
     * Что напечатается в консоль после выполнения этого кода?
     * */
    private static Object lock = new Object();
    private static Integer value = 0;

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = IntStream.range(0, 1000).boxed().map(i -> {
            final int v = i;
            return new Thread(() -> increment(v));
        }).collect(toList());

        threads.forEach(Thread::start);

        Thread.sleep(2000);
        System.out.println(value);
    }

    public static void increment(Integer i) {
        synchronized (lock) {
            value = value + 1;
        }
    }

    /**
     * Варианты ответа:
     * 1) 0;
     * 2) Число <= 1000;
     * 3) 1000;
     * 4) Выбросится ConcurrentModificationException;
     * 5) Ошибка компиляции;
     *
     * Правильный ответ:
     * 3)
     *
     * Верно, synchronized секция пускает только один поток в критическую секцию.
     * Поэтому потоки не мешают друг другу выполнить инкремент.
     * */
}
