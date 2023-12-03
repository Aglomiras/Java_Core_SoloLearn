package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_10 {
    /**
     * Возрастная группа
     * Выведите возрастную группу человека на основе его возраста, который дан в качестве ввода.
     * Вот возрастные группы, которые вы будете использовать:
     * <p>
     * Child: 0 to 11
     * Teen: 12 to 17
     * Adult: 18 to 64
     * <p>
     * Пример ввода
     * 42
     * <p>
     * Пример вывода
     * Adult
     * <p>
     * Помните, что вы можете использовать оператор AND для объединения условий, например, x>0 && x<20.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //ваш код
        if (age >= 0 && age <= 11) {
            System.out.println("Child");
        }
        if (age >= 12 && age <= 17) {
            System.out.println("Teen");
        }
        if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        }
    }
}
