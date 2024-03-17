package org.mpei.WorkSololearn_18;

import java.time.LocalTime;

public class Practic_4 {
    private Integer value = 0;

    public synchronized void addTen() {
        value += 10;
    }

    public Integer printValueCharacteristics() {
        System.out.println("Current time: " + LocalTime.now());
        synchronized (this) { //this необходим, чтобы вывелось актуальное значение
            System.out.println("value: " + value);
        }
        return value;
    }
}
