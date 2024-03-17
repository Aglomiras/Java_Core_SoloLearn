package org.mpei.WorkSololearn_18;

public class Practic_3 {
    private int count = 0;

    public synchronized void add(int value) {
        count += value;
    }

    public int getCount() {
        return count;
    }

    /**
     * У метода add есть synchronized, значит изменение count пройдёт атомарно, ничего не потеряется
     * Но в этом коде возможна ситуация, когда один поток УЖЕ обновил count, а другой прочитал устаревшее значение.
     *
     * Как починить ошибку? Один из способов - добавить synchronizedметоду getCount():
     *
     * private int count = 0;
     *
     * public synchronized void add(int value) {
     *    count += value;
     * }
     * public synchronized int getCount() {
     *    return count;
     * }
     * */
}
