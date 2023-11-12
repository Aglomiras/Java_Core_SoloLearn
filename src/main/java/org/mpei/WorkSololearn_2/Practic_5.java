package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_5 {
    /**
     * Циклы for
     * Вам дан код, который принимает в качестве входных данных количество студентов, которые поступили в университет.
     * Давайте их поздравим!
     * <p>
     * Задача
     * Завершите программу, чтобы вывести "Welcome" для каждого студента.
     * <p>
     * Пример Входных Данных
     * 2
     * <p>
     * Пример Выходных Данных
     * Welcome
     * Welcome
     * <p>
     * Не забудьте точку с запятой (;) после инициализации и условие в синтаксисе.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Welcome");
        }
    }
}
