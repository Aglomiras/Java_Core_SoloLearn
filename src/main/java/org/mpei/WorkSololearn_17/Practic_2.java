package org.mpei.WorkSololearn_17;

import java.time.LocalDate;

public class Practic_2 {
    /**
     * Тестовый вопрос №2:
     * */
    private volatile String name = "";

    private LocalDate birthDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    /**
     * Какая ошибка возможна в этом коде?
     *
     * Варианты ответа:
     * 1) getName вернёт устаревшее значение;
     * 2) getName вернёт значение, которое не выставлял ни одни поток;
     * 3) setName запишет в переменную name неконсистентное значение;
     * 4) Выбросится ConcurrentModificationException при одновременной работе нескольких потоков;
     * 5) Всё ок;
     *
     * Правильный ответ:
     * 5)
     * */
}
