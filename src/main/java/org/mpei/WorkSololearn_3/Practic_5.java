package org.mpei.WorkSololearn_3;

import java.util.Scanner;

public class Practic_5 {
    /**
     * Строка наоборот
     * Напишите программу, которая использует строку в качестве вводных данных и выведет в результат ее же задом наперед.
     * Данный код берет строку и переводит ее в массив char.
     *
     * Пример вводных данных:
     * hello there
     *
     * Пример результата:
     * ereht olleh
     *
     * Вы можете итерировать вдоль массива char, начиная с конца с помощью arr.length, чтобы получить размер массива.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //введите код сюда
        char[] arr1 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - 1 - i];
            System.out.print(arr1[i]);
        }
    }
}
