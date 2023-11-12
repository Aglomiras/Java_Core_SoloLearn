package org.mpei.WorkSololearn_11.Practic_3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /**
     * LinkedLists
     * Данная вам программа объявляет LinkedList «words».
     * Создайте программу, которая использует слова в качестве вводных данных и будет добавлять их в LinkedList,
     * пока его размер не будет равен 5, и выведет в результат только слова длиной более 4 символов.
     * <p>
     * Пример вводных данных
     * Java
     * practice
     * is
     * makes
     * perfect
     * <p>
     * Пример результата
     * practice
     * makes
     * perfect
     * <p>
     * Метод length() возвращает число символов в строке.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<String>();

        while (words.size() < 5) {
            String word = scanner.nextLine();
            //добавьте слово в LinkedList
            words.add(word);
        }
        //введите код сюда
        for (String c : words) {
            if (c.length() > 4) {
                System.out.println(c);
            }
        }
    }
}
