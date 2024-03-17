package org.mpei.WorkSololearn_18;

import java.time.LocalTime;

public class Practic_5 {
    private static Integer value = 0;

    public static synchronized void addTen() {
        value += 10;
    }

    public Integer printValueCharacteristics() {
        System.out.println("Current time: " + LocalTime.now());
        synchronized (Practic_5.class) { //А в этом примере необходимо написать Practic_5.class, чтобы выдавалось актуальное значение value
            System.out.println("value: " + value);
        }
        return value;
    }
}
