package org.mpei.WorkSololearn_13.Practic_2;

class B implements Runnable {
    public void run() {
        System.out.println("B");
    }
}

class A extends Thread {
    public void run() {
        System.out.println("A");
        Thread t = new Thread(new B());
        t.start();
    }

    public static void main(String[] args) {
        A object = new A();
        object.start();
    }
}
