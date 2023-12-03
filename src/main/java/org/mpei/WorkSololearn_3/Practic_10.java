package org.mpei.WorkSololearn_3;

import java.util.Scanner;

public class Practic_10 {
    /**
     * Бот
     * Вы создаете программу для автоматических ответов для магазина.
     * Бот должен принимать ключевое слово от пользователя в качестве ввода и отвечать автоматическим сообщением.
     *
     * Пока есть только 3 ответа:
     *
     * Сообщение пользователя: "order", Ответ: "Заказ подтвержден"
     * Сообщение пользователя: "contacts", Ответ: "info@sololearn.com"
     * Ответ на любое другое сообщение должен быть следующим: "Try again".
     *
     * Данный код вызывает метод с именем bot(). Определите метод, который должен принимать ввод типа String от пользователя
     * и обрабатывать вышеупомянутые случаи с выводом соответствующего ответа.
     *
     * Не изменяйте вызов метода в main().
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        bot(val);
    }
    public static void bot(String val) {
        switch (val) {
            case ("order"):
                System.out.println("Заказ подтвержден");
                break;
            case ("contacts"):
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try again");
        }
    }
}
