package org.mpei.WorkSololearn_3;

import java.util.Scanner;

public class Practic_7 {
    /**
     * Торговый автомат
     * Вы создаете программу для торгового автомата с напитками.
     * Меню напитков хранится в массиве с названием menu:
     * String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
     * JAVA
     * Примите выбор покупателя в виде целого числа в качестве ввода и выведите соответствующий пункт меню.
     * Кроме того, добавьте проверку: если ввод находится вне ожидаемого диапазона, выведите "Invalid".
     * Выбор определяет индекс массива.
     * */
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //ваш код
        int val = sc.nextInt();

        if (val >= 0 && val <= menu.length) {
            System.out.println(menu[val]);
        } else {
            System.out.println("Invalid");
        }
    }
}
