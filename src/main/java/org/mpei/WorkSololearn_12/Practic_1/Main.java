package org.mpei.WorkSololearn_12.Practic_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    /**
     * HashMap
     * Данная вам программа определяет и выводит в результат HashMap, где имена сотрудников хранятся в качестве ключей, а их возраст – в качестве значений.
     * Она также получает число N от пользователя в качестве лимита возраста. Напишите код, который удалит всех сотрудников, чей возраст меньше числа N.
     * Строка кода для вывода объекта HashMap уже написана.
     * <p>
     * Пример вводных данных
     * 25
     * <p>
     * Пример результата
     * {Robert=32, John=28}
     * <p>
     * Совет
     * Используйте метод get() для доступа к значениям в HashMap и remove(), чтобы удалить их.
     * <p>
     * nameArr – это массив данных ключей HashMap, созданный для итерации.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);

        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);

        int ageLimit = scanner.nextInt();

        for (String emp : nameArr) {
            //введите код сюда
            if (ages.get(emp) < ageLimit) {
                ages.remove(emp);
            }
        }
        System.out.println(ages);
    }
}
