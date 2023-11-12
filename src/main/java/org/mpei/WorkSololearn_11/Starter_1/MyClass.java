package org.mpei.WorkSololearn_11.Starter_1;

public class MyClass {
    public static void main(String[] args) {
        Thread t = new Thread(new Loader());
        t.start();
    }
}
