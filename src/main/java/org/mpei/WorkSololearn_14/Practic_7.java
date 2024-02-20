package org.mpei.WorkSololearn_14;

public class Practic_7 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Practic_7();
        thread.run(); //поток thread еще не запущен, поэтому выведет main
        thread.start(); //старт потока thread, теперь поток запущен и выведет его имя Thread-0
        Thread.sleep(1000);
        thread.run(); //вызов метода из основного потока

        //thread.start();//Выведет InterruptedException, так как будет прерывание запущенного потока
    }
}
