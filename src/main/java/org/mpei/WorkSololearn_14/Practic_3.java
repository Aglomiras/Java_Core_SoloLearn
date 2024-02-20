package org.mpei.WorkSololearn_14;

public class Practic_3 {
    /**
     * Способы сообщения потоку задачи.*/
    public static void main(String[] args) {
        /**Сообщить потоку, что мы от него хотим, можно двумя способами.
         * Способ 1 - Передать экземпляр Runnable.*/
        Thread t = new Thread(() -> System.out.println("Hello"));
        t.start();

        /**Способ 2 - Сделать наследника от класса Thread и переопределить метод run.*/
        Thread t1 = new MyThread();
        /**
         * В обоих случаях Thread t - это просто объект. При вызове t.run() просто выполнится код внутри метода без создания нового потока.
         * Чтобы код выполнился в новом потоке, нужно вызвать t.start().
         * Под капотом будет создан новый поток в операционной системе и множество структур внутри JVM.
         * И затем в новом потоке выполнится метод run.*/
        t1.start();
    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}