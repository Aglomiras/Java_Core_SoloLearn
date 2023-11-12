package org.mpei.WorkSololearn_8.Practic_1;

import java.util.Scanner;

public class main {
    /**
     * Приведение
     * Компьютеры понимают только числа и для него все символы выражаются только числами.
     * Программа, данная вам, получает символ в качестве вводных данных.
     * Напишите программу для вывода его числового значения.
     * <p>
     * Пример вводных данных
     * a
     * <p>
     * Пример результата
     * 97
     * <p>
     * Используйте приведение с символа в число.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char a = read.next().charAt(0);
        System.out.println((int) a);
    }
}
