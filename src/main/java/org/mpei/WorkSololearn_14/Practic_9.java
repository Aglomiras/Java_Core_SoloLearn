package org.mpei.WorkSololearn_14;

public class Practic_9 {
    /**
     * ЛОКАЛЬНЫЙ СТЕК ПОТОКА
     *
     * В JVM есть две большие области:
     * - куча (heap) - там находятся объекты и примитивы, доступные всем потокам
     * - стеки потоков (stack memory). У каждого потока есть свой стек, в котором хранятся локальные примитивы потока и ссылки на объекты из кучи
     *
     * */
    public static void main(String[] args) {
        String message = "Hello ";

        Task t1 = new Task(message);
        Task t2 = new Task(message);
        t1.start();
        t2.start();
        //В консоли будет:
        //Hello 6
        //Hello 6
    }
    /**
     * Переменная i у каждого потока своя. Поток Т1 вообще не в курсе, какие переменные у Т2 и чем он занимается.
     * Объект "Hello" находится в куче в единственном экземпляре.
     * Каждый поток работает со своей ссылкой на эту переменную.
     * Ссылка у каждого своя, но указывают они на один и тот же объект.*/
}

class Task extends Thread {
    private String message;

    public Task(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        int i = 5;
        i++;
        System.out.println(message + i);
    }
}


