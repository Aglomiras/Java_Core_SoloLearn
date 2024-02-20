package org.mpei.WorkSololearn_14;

public class Practic_1 {
    public static void main(String[] args) {
        Runnable task = () -> {
            //Здесь пишем код, который хотим выполнить в другом потоке
            System.out.println("Поток работает!");
        };

        Thread t = new Thread(task); //создаём объект потока и передаём код, который он должен выполнить
                                     //пока что это просто объект класса Thread
        t.start();                   //Запускаем поток. Задача выполняется в новом потоке
    }
}
