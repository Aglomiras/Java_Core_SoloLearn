package org.mpei.WorkSololearn_6.Practic_1;

import java.util.Scanner;

public class Main {
    /**
     * Инкапсуляция
     * Вам нужна программа для приема в художественную школу. Ученики могут быть приняты в школу, если им исполнилось 6 лет.
     * Вам дана программа, которая объявляет класс Pupil.
     * <p>
     * Задача
     * Завершите метод setAge класса Pupil. Если значение параметра a выше 6, назначьте его атрибуту age и выведите "Welcome".
     * В противном случае выведите "Sorry".
     * <p>
     * Пример Входных Данных
     * 7
     * <p>
     * Пример Выходных Данных
     * Welcome
     * <p>
     * Используйте оператор if для проверки указанного условия.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        Pupil pupil = new Pupil();
        pupil.setAge(a);
    }
}
