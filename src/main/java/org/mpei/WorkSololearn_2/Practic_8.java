package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_8 {
    /**
     * Кипящая вода
     * Вы пишете программу для датчика воды, который проверяет, кипит ли вода.
     * Примите температуру в градусах Цельсия, выраженную целым числом, в качестве ввода и выведите "Boiling", если температура больше или равна 100.
     * В противном случае выведите "Not boiling".
     * <p>
     * Пример ввода
     * 105
     * <p>
     * Пример вывода
     * Boiling
     * <p>
     * Убедитесь, что выведенный текст в точности соответствует тексту, определённому в коде.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        if (val >= 100) {
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
    }
}
