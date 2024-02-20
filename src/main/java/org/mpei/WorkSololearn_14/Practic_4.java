package org.mpei.WorkSololearn_14;

public class Practic_4 {
    /**ИМЕНА ПОТОКОВ
     *
     * Первый поток в программе выполняет код метода main и поэтому называется main.*/
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();// main
        /**
         * Одни потоки могут порождать другие.
         * В предыдущих примерах main поток создавал другие потоки.
         * По умолчанию их имена не очень выразительные, задать имя можно с помощью метода setName.*/
        Thread t = new Thread(() -> {});
        System.out.println(t.getName());// "Thread-0"

        t.setName("Update users thread");
        t.start();
        System.out.println(t.getName());// "Update users thread"
        /**Имена потоков помогают проще разобраться в логах и понять, где произошла проблема.*/
    }
}
