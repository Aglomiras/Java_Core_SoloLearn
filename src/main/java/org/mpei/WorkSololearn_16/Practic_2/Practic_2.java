package org.mpei.WorkSololearn_16.Practic_2;

public class Practic_2 {
    public static void main(String[] args) {

        Point p = new Point(0, 0);

        Thread t1 = new Thread(() -> {
            p.x = 100;
            try {
                Thread.sleep(50); // + try-catch
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            p.y = 100;
        });

        Thread t2 = new Thread(() -> {
            System.out.println(p);
        });

        t1.start();
        t2.start();

        /**
         * Резюме: если переменные логически связаны между собой,
         * во время их изменения объект может быть в неконсистентном состоянии.
         * */
    }
}

