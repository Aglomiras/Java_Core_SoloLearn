package org.mpei.WorkSololearn_5;

import java.util.Scanner;

public class Practic_1 {
    /**
     * Класс Math
     * Напишите программу, которая использует в качестве вводных данных числа и выведет в результат первое число, возведенное в степень второго.
     *
     * Пример вводных данных
     * 2
     * 4
     *
     * Пример результата
     * 16.0
     *
     * Используйте метод Math.pow().
     * */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        //введите код сюда
        double a = Math.pow(num1, num2);
        System.out.println(a);
    }
}
