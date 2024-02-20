package org.mpei.WorkSololearn_14;

public class Practic_2 {
    /**
     * Представим школьный урок. Ученикам Васе и Ване дали задачи: одному написать числа от 1 до 5, другому от 10 до 14.
     * Необходимо реализовать много поточную программу, которая сможет представить независимую работу обоих учеников.*/
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 1; i <= 4; i++) {
                System.out.println(i);
            }
        };

        Runnable task2 = () -> {
            for (int i = 10; i <= 14; i++) {
                System.out.println(i);
            }
        };

        Thread vasy = new Thread(task1); //Поток Вася
        Thread vany = new Thread(task2); //Поток Ваня
        vasy.start();
        vany.start();
    }
    /**
     * Запуская программу каждый раз, можно наблюдать разный вывод в консоле.
     * Код в рамках одного потока выполняется последовательно, но оба потока выполняются параллельно.*/
}
