package org.mpei.WorkSololearn_17;

import java.time.LocalDate;
import java.time.Period;

public class Practic_3 {
    /**
     * Тестовый вопрос №3:
     * */
    public static LocalDate importantDate = LocalDate.of(2010, 10, 20);

    public static void main(String[] args) {
        Period period = Period.between(importantDate, LocalDate.now());

        int years = period.getYears();
        System.out.println(years);
    }

    /**
     * Для каких переменных добавление volatile поможет избежать многопоточных проблем?
     * Варианты ответа:
     * 1) importantDate. Когда поток обновит importantDate, другие потоки будут считывать актуальную дату;
     * 2) period. Если переменная уже была проинициализирована, при обновлении поля importantDate эта переменная тоже обновится;
     * 3) years. Если переменная уже была проинициализирована, при обновлении поля period эта переменная тоже обновится
     * 4)Всё и так нормально, volatile нигде не нужен
     *
     * Правильный ответ:
     * 1)
     *
     * ВАЖНО!!!
     * volatile не имеет смысла для локальных переменных, только для общих.
     * */
}
