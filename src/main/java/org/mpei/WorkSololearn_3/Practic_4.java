package org.mpei.WorkSololearn_3;

public class Practic_4 {
    /**
     * Многомерный массив
     * Вам дана матрица 3x3 с числами:
     *
     * int[][] matrix = {
     *     {8, 1, 6},
     *     {3, 5, 7},
     *     {4, 9, 0},
     * }
     * JAVA
     * Выведите числа из массива, каждое на новой строке.
     *
     * Подсказка: Вам нужно использовать два вложенных цикла for для обхода массива.
     * */
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        //выведите числа
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
