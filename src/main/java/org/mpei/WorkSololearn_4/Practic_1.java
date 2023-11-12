package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_1 {
    /**
     * Методы
     * Вы создаете робота по имени “Welcomer 2000”, который любит приветствовать людей и никогда не упустит такой возможности.
     * Вам нужно только указать ему количество человек, которое войдет в комнату, а он прокричит «Добро пожаловать!» именно столько раз.
     * В данный момент программа уже берет указываемое число в качестве вводных данных и вызывает метод соответствующее количество раз. Исправьте программу.
     *
     * Пример вводных данных
     * 2
     *
     * Пример результата
     * Welcome!
     * Welcome!
     *
     * Необходимо выполнить вывод внутри метода.
     * */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numberOfPeople = read.nextInt();
        for (int i = 0; i < numberOfPeople; i++) {
            welcome();
        }
    }
    public static void welcome() {
        System.out.println("Welcome!");
        //завершите метод
    }
}
