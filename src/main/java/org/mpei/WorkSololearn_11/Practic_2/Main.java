package org.mpei.WorkSololearn_11.Practic_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * ArrayList
     * Данная вам программа объявляет ArrayList из целых чисел.
     * Напишите программу, которая будет использовать числа в качестве вводных данных и добавлять их в ArrayList, пока размер ArrayList не будет равен 3.
     * После этого необходимо вычислить и вывести в результат среднее всех значений в формате целого числа.
     * <p>
     * Пример вводных данных
     * 5
     * 2
     * 4
     * <p>
     * <p>
     * Пример результата
     * 3
     * <p>
     * Используйте evennums.size() в цикле while.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evennums = new ArrayList<Integer>();

        int sum = 0;
        while (evennums.size() < 3) {
            int num = scanner.nextInt();
            //введите код сюда
            evennums.add(num);
            sum += num;
        }

        //вычислите и выведите в результат среднее всех значений целых чисел
        System.out.println(sum / evennums.size());
    }
}
