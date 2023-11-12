package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_6 {
    /**
     * Циклы do while
     * Вы создаете систему безопасности банка. Пользователь должен ввести правильный пароль для доступа к платежам.
     * Пароль 8819.
     *
     * Задача
     * Напишите программу, которая будет беспрерывно принимать пароль в качестве входных данных и выводить Write password, пока клиент не введет правильный пароль.
     *
     * Пример Входных Данных
     * 3332
     * 8819
     *
     * Пример Выходных Данных
     * Write password
     * Write password
     *
     * Используйте Scanner в цикле do while, чтобы беспрерывно принимать входные данные.
     * */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int password;
        do {
            password = read.nextInt();
            System.out.println("Write password");
        } while (password != 8819);
    }
}
