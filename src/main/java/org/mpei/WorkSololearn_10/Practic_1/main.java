package org.mpei.WorkSololearn_10.Practic_1;

import java.util.Scanner;

public class main {
    /**
     * Обработка исключений
     * Онлайн-магазин продает 5 категорий электротоваров: PCs, Notebooks, Tablets, Phones, and Аccessories.
     * Данная вам программа объявляет массив и сохраняет в него типы товаров.
     * Напишите программу, которая использует число N в качестве вводного и выведет элемент массива с индексом N. Если индекс находится вне диапазона,
     * то программа должна вывести в результат фразу "Wrong Option".
     * <p>
     * Пример вводных данных
     * 5
     * <p>
     * Пример результата
     * Wrong Option
     * <p>
     * Используйте тип Exception, чтобы выявить все возможные исключения.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        //завершите код
        try {
            String name = categories[choice];
            System.out.println(name);
        } catch (Exception e) {
            System.out.println("Wrong Option");
        }
    }
}
