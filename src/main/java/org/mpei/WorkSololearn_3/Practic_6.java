package org.mpei.WorkSololearn_3;
import java.util.Scanner;

public class Practic_6 {
    /**
     * Факториал
     * Факториал числа N равен 1*2*3*...*N
     * Например, факториал числа 5 равен 1*2*3*4*5 = 120
     * Создайте программу, которая принимает число в качестве ввода и выводит факториал этого числа.
     * Для вычисления используйте цикл for. Начните цикл с числа 1.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        long sum = 1;
        for (int i = 0; i <= val; i++) {
            if (i == 0) {
                continue;
            }
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
