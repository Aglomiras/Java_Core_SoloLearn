package org.mpei.WorkSololearn_12.Practic_2;

import java.util.*;
import java.util.Scanner;

public class Main {
    /**
     * Списки сортировки
     * Данная вам программа заявляет ArrayList из целых чисел.
     * Завершите программу, которая получит числа в качестве вводных данных и будет добавлять их в
     * ArrayList до тех пор, пока его размер не будет равен 5. После этого выведите в результат максимальное и минимальное значения.
     * <p>
     * Пример вводных данных
     * 4
     * 12
     * 3
     * 88
     * 96
     * <p>
     * Пример результата
     * 96
     * 3
     * <p>
     * Используйте Collection.max() и Collection.min(), чтобы получить максимальное и минимальное значения.
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        while (nums.size() < 5) {
            int num = scanner.nextInt();
            //введите код сюда
            nums.add(num);
        }
        //введите код сюда
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}
