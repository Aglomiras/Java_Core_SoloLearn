package org.mpei.WorkSololearn_18.Practic_8;

import lombok.SneakyThrows;

public abstract class AbstractParent {

    @SneakyThrows
    public synchronized void runParent() {
        System.out.println("Parent start");
        Thread.sleep(2000);
        System.out.println("Parent end");
    }
}
