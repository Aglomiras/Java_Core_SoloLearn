package org.mpei.WorkSololearn_13.Practic_1;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    /**
     * Создание и запись файлов
     * Вы хотите распланировать свой день и создать список дел.
     * Дополните программу, чтобы она принимала названия трех задач в качестве входных данных и записывала их в файле "tasks.txt", каждую на новой строке.
     * Затем используйте метод readFile() для вывода задач.
     * <p>
     * Пример Кода
     * Workout
     * Report
     * Pool
     * <p>
     * Пример Выходных Данных
     * Workout
     * Report
     * Pool
     * <p>
     * Добавьте \n в конец каждой строки для перехода на новую строку.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            while (count < 3) {
                //ваш код
                String val = input.next();
                f.format(val + "\r\n");
                count++;
            }
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
