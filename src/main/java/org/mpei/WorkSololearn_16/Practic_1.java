package org.mpei.WorkSololearn_16;

public class Practic_1 {
    public static int value = 10;    // общая переменная

    public static void print() {
        int i = 5;                   // локальная переменная для каждого потока
        System.out.println(i);
        i += value;
        value = 20;                  // меняем общую переменную
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> print());
        t1.start();
        t1.join();

        Thread t2 = new Thread(() -> print());
        t2.start();
        t2.join();
    }
}
