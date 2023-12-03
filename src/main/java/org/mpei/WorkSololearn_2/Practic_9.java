package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_9 {
    /**
     * Коробки
     * Вы создаёте робота, который должен классифицировать предметы по их цвету.
     * Каждому цвету соответствует коробка с определенным номером.
     * Для простоты наша программа будет обрабатывать всего 3 цвета:
     * <p>
     * red отправляется в коробку №1
     * green отправляется в коробку №2
     * black отправляется в коробку №3
     * <p>
     * Ваша программа должна принимать цвет в качестве ввода и выводить соответствующий номер коробки.
     * <p>
     * Пример ввода
     * green
     * <p>
     * Пример вывода
     * 2
     * <p>
     * Помните, вы можете использовать инструкцию switch для проверки выполнения различных условий.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();

        switch (color) {
            case ("red"):
                System.out.println(1);
                break;
            case ("green"):
                System.out.println(2);
                break;
            case ("black"):
                System.out.println(3);
                break;
        }
    }
}
