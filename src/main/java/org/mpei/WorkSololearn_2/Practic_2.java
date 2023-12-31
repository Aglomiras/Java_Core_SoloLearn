package org.mpei.WorkSololearn_2;

import java.util.Scanner;

public class Practic_2 {
    /**
     * Вложенные операторы if
     * Менеджер по продажам решил предоставлять подарочную карту покупателям, совершившим покупки на сумму более 15000. Кроме того, клиенты, общая сумма покупок которых превышает 30 000, получат вторую подарочную карту.
     * Вам дана программа, которая принимает сумму покупки в качестве входных данных и выводит "Gift card", если она выше 15000.
     *
     * Задача
     * Завершите код, чтобы выводить "Gift card" еще раз, если сумма покупок выше 30000.
     *
     * Пример Входных Данных
     * 36000
     *
     * Пример Выходных Данных
     * Gift card
     * Gift card
     *
     * Добавьте оператор if внутри существующего для обработки второго условия.
     * */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int purchases = read.nextInt();

        if(purchases > 15000){
            System.out.println("Gift card");

            //Завершите код
            if(purchases > 30000){
                System.out.println("Gift card");
            }
        }
    }
}
