package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_3 {
    /**
     * Выражение switch
     * Ваш робот может распознать эмоции, каждая из которых отмечена цифрой:
     * 1 - You are happy!
     * 2 - You are sad!
     * 3 - You are angry!
     * 4 - You are surprised!
     * Напишите программу, которая берет номер эмоции в качестве вводных данных и выводит соответствующее сообщение в заданном формате.
     * Если вы вводите номер эмоции, которую программа не знает, то она должна вывести: «Unknown emotion.».
     *
     * Пример вводных данных
     * 1
     *
     * Пример результата
     * You are happy!
     *
     * Не забудьте про выражение break.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emotion = scanner.nextInt();
       /*
       1 - "You are happy!"
       2 - "You are sad!"
       3 - "You are angry!"
       4 - "You are surprised!"
       other - "Unknown emotion."
       */

        switch (emotion){
            case 1:
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3:
                System.out.println("You are angry!");
                break;
            case 4:
                System.out.println("You are surprised!");
                break;
            default:
                System.out.println("Unknown emotion.");
        }
    }
}
