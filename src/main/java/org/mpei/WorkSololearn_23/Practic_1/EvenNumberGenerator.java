package org.mpei.WorkSololearn_23.Practic_1;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class EvenNumberGenerator {
    //Константа для увеличения значения value
    private static final int GENERATION_DELTA = 5;

    private final AtomicInteger value = new AtomicInteger(0);

    //Возвращение значения value (предыдущее) и увеличивает его на константу
    public int generate() {
//        System.out.println(new Date());
        return this.value.getAndAdd(GENERATION_DELTA);
    }

    //Возвращает значение value
    public int getValue() {
        return this.value.intValue();
    }
}
