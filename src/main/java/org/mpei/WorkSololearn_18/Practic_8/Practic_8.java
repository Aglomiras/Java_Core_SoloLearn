package org.mpei.WorkSololearn_18.Practic_8;

public class Practic_8 {
    public static void main(String[] args) {
        Child child = new Child();

        new Thread(() -> child.runChild()).start();
        new Thread(() -> child.runParent()).start();
    }
}
