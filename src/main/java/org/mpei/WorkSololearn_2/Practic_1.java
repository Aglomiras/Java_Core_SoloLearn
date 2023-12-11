package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_1 {
    /**
     * Условные oператоры:
     * У вас есть $12 000 на покупку машины.
     * Вам дана программа, которая принимает цену машины в качестве входных данных.
     * <p>
     * Задача
     * Выведите "yes", если цена ниже или равна 12 000.
     * <p>
     * Пример Входных Данных
     * 11000
     * <p>
     * Пример Выходных Данных
     * yes
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();

        //завершите код
        if (price <= 12000) {
            System.out.println("yes");
        }
    }
}
