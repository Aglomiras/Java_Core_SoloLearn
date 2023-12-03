package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_9 {
    /**
     * Из Цельсия в Фаренгейт
     * Вы создаёте конвертер градусов Цельсия в градусы Фаренгейта.
     * <p>
     * Напишите метод, который принимает значение в градусах Цельсия в качестве аргумента и возвращает соответствующее значение в градусах Фаренгейта.
     * <p>
     * Пример ввода
     * 36
     * <p>
     * Пример вывода
     * 96.8
     * <p>
     * Данный код принимает значение celsius в качестве ввода и передаёт его методу fahr(), который вам необходимо создать.
     * Для вычисления значения в градусах Фаренгейта используется следующее уравнение: 1.8 * celsius + 32.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        System.out.println(fahr(c));
    }

    public static double fahr(double celsius) {
        return (1.8 * celsius + 32);
    }
}
