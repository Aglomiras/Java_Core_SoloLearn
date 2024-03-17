package org.mpei.WorkSololearn_18.Practic_9;

import lombok.SneakyThrows;

public class Child extends AbstractParent {

    @SneakyThrows
    public static synchronized void runChild() {
        System.out.println("Child start");
        Thread.sleep(2000);
        System.out.println("Child end");
    }
}
