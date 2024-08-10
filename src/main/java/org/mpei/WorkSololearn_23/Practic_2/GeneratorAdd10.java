package org.mpei.WorkSololearn_23.Practic_2;

import java.util.concurrent.atomic.AtomicInteger;

public class GeneratorAdd10 {
    /**Константа для увеличения переменной*/
    private final static int CONSTANT = 10;

    /**Переменная типа AtomicInteger*/
    private final AtomicInteger atomicIntegerValue = new AtomicInteger(0);

    /**Метод по увеличению переменной на 10 единиц*/
    public int generateAdd10() {
        return this.atomicIntegerValue.getAndAdd(CONSTANT);
    }

    /**Обычный getter*/
    public int getAtomicIntegerValue() {
        return this.atomicIntegerValue.intValue();
    }
}
