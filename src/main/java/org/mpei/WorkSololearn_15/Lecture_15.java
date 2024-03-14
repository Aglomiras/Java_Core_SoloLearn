package org.mpei.WorkSololearn_15;

public class Lecture_15 {
    /**
     * ЭКЗЕКЬЮТОРЫ
     *
     * Создание и уничтожение потоков - очень затратная операция, и заниматься этим для каждой новой задачи нерационально.
     * Создание потока может длиться дольше, чем задача, которую он выполняет.
     * Гораздо лучше создать поток один раз, и затем переиспользовать его.
     *
     * Экзекьютор - это верхнеуровневая структура, которая скрывает за собой готовый набор потоков (пул потоков) и очередь задач.
     *
     * Задачи из очереди распределяются по свободным потокам. При завершении задачи поток возвращается обратно в пул.
     * В чём плюс такой организации:
     * 1) Более эффективное использование потоков
     * 2) Размер пула потоков можно ограничить. И таким образом влиять на размер памяти,
     * который занимают потоки и на пропускную способность системы
     *
     * Как работать с экзекьютором?
     * - Берём задачу, которую нужно выполнить асинхронно
     * - Оформляем её в экземпляр интерфейса Runnable, так же как и при создании потока
     * - Отправляем этот Runnable в экзекьютор
     *
     * Пример 1 и 2 можно посмотреть в соответствующих практиках Practic_1 и Practic_2.
     *
     *
     * КЛАСС FUTURE
     *
     * У экзекьюторов есть ещё одно преимущество перед созданием потоков вручную.
     * Это возможность отследить статус задачи и получить результат:
     * - Заворачиваем задачу в интерфейс Callable
     * - Отправляем в экзекьютор
     * - Получаем объект Future для отслеживания результата
     *
     * Зачем нужен посредник в виде Future? Почему бы экзекьютору не вернуть результат как есть?
     * Вот так:
     * Integer res = executor.submit(() -> 12*15);
     *
     * Ответ: чтобы записать результат в переменную, надо дождаться пока задача завершится.
     * Теряется весь смысл отправки задачи в другой поток. Если приходится ждать результат прямо сейчас,
     * код выше равноценен последовательному выполнению Integer res = 12*15;
     *
     * С помощью объекта Future мы можем проверить, завершилась задача или нет. Если нет, занять поток чем-то ещё:
     *
     * Future<Integer> res = executor.submit(c);
     * while (!res.isDone()) {
     *     // какой-то другой код
     * }
     * Integer value = res.get();
     *
     * Пример 3 с использованием Future можно рассмотреть в Practic_3
     *
     *
     * Также в классе Executors есть фабричные методы, которые тоже возвращают экзекьютор:
     * - Executors.newSingleThreadExecutor() - с одним потоком в пуле
     * - Executors.newFixedThreadPool(int nThreads) - с числом потоков, равным nThreads
     * - Executors.newCachedThreadPool() - число потоков в пуле - динамическое. При необходимости потоки добавляются в пул,
     * но если поток простаивает минуту, он удаляется
     *
     * Три варианта выше часто встречаются на практике. У каждого варианта есть свои плюсы и минусы.
     *
     * Подбор экзекьютора и его параметров - очень нетривиальная задача, которая очень затрагивает производительность.
     * Надо принять во внимание ограничения системы, сервера, другие задачи сервиса и т.д.
     * */
}