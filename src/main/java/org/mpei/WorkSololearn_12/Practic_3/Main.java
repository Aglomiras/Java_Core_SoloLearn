package org.mpei.WorkSololearn_12.Practic_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /**
     * Итераторы
     * Данная вам программа заявляет LinkedList целых чисел, берет у пользователя 5 чисел и добавляет их в него.
     * Напишите программу для вычисления и вывода в результат суммы этих элементов.
     * <p>
     * Пример вводных данных
     * 4
     * 3
     * 50
     * 3
     * 8
     * <p>
     * Пример результата
     * 68
     * <p>
     * Используйте Iterator и его методы для вычисления при помощи цикла while.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<Integer>();

        while (nums.size() < 5) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        int sum = 0;
        //введите код сюда
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            Integer value1 = it.next();
            sum += value1;
        }

        System.out.println(sum);
    }
}
