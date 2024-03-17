package org.mpei.WorkSololearn_18.Practic_8;

import lombok.SneakyThrows;

public class Child extends AbstractParent {

    @SneakyThrows
    public synchronized void runChild() {
        System.out.println("Child start");
        Thread.sleep(2000);
        System.out.println("Child end");
    }
}
