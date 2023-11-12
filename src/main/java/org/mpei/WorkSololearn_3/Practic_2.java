package org.mpei.WorkSololearn_3;

import java.util.Scanner;

public class Practic_2 {
    /**
     * Суммирование элементов в массивах
     * Данная программа принимает длину массива в качестве первого ввода данных, создает его, а затем принимает следующие вводные данные в качестве элементов массива.
     *
     * Завершите программу, чтобы она вычислила и показала сумму тех чисел массива, которые кратные 4.
     *
     * Пример вводных данных
     * 5
     * 4
     * 9
     * 16
     * 2
     * 7
     *
     * Пример результата
     * 20
     *
     * Для получения всех вводных данных вы можете использовать scanner.nextInt().
     * Но помните, что количество повторов должно соответствовать количеству значений.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array =  new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        //введите код сюда
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if ((array[i] % 4) == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }
}
