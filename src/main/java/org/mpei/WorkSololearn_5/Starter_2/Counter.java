package org.mpei.WorkSololearn_5.Starter_2;

public class Counter {
    public static int COUNT = 0;
    Counter() {
        COUNT++;
    }
    /**
     * Переменная COUNT будет разделена всеми объектами этого класса.
     * Теперь, мы можем создать объекты нашего класса Counter в main, и получить доступ к статической переменной.
     * */
}
