package org.mpei.WorkSololearn_3;

import java.util.Scanner;

public class Practic_9 {
    /**
     * Кинотеатр
     * Вы создаете программу продажи билетов для небольшого кинотеатра.
     * Места представлены в виде 2-мерного массива.
     * Каждый элемент может иметь значения 1 и 0, где 1 означает "занято", и 0 — "свободно".
     * Ваша программа должна принять в качестве ввода строку и столбец места и вывести "Free", если оно свободно, и "Sold", если нет.
     */
    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        //ваш код
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (seats[x][y] == 0) {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }
    }
}
