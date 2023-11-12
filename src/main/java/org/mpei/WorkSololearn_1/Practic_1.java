package org.mpei.WorkSololearn_1;

import java.util.Scanner;

public class Practic_1 {
    /**
     * Конвертер времени
     * Вам требуется программа для перевода дней в секунды.
     * Данный код использует количество дней в качестве вводных данных. Завершите код для перевода количества дней в секунды и вывода результата.
     * <p>
     * Пример вводных данных:
     * 12
     * <p>
     * Пример результата:
     * 1036800
     * <p>
     * Пояснение: 12 дней – это 12*24 = 288 часов, то есть 288*60 = 17280 минут, которые равны 17280*60 = 1036800 секундам.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //введите код сюда
        int second = days * 24 * 60 * 60;
        System.out.println(second);
    }
}
