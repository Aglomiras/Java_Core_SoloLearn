package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_8 {
    /**
     * Конвертер футов в дюймы
     * Необходимо создать метод, который преобразует футы в дюймы.
     * В одном футе 12 дюймов.
     * <p>
     * Объявите метод convert(), который принимает значение в футах в качестве аргумента и выводит значение в дюймах.
     * Результат должен иметь тип double.
     * <p>
     * Данный код принимает значение в футах в качестве ввода и передаёт его в метод convert.
     * Объявите метод convert, чтобы данный код заработал.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val = scanner.nextDouble();
        convert(val);
    }

    public static void convert(double val) {
        System.out.println(val * 12);
    }
}
