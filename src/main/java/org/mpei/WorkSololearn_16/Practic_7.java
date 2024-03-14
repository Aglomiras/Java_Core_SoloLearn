package org.mpei.WorkSololearn_16;

public class Practic_7 {
    /**
     * Тестовый вопрос №1:
     * <p>
     * Класс Practic_7 представляет собой имитацию пункта аренды велосипедов:
     * <p>
     * rentBike - взять велосипед в аренду. Входной параметр - количество часов, на которое берут велосипед,
     * выходной - доступна ли сейчас выдача;
     * returnBike вызывается, когда велосипед вернули в пункт;
     * printStatus показывает текущую ситуацию;
     * Предположим, что это бэкенд огромной сети прокатных пунктов, и с классом работает огромное количество потоков.
     * <p>
     * Какие проблемы возможны в этом коде?
     */

    private int hourPrice = 5;    // стоимость часа аренды
    private int moneyEarned = 0;  // сколько денег заработано
    private int available = 10;   // количество доступных велосипедов

    public boolean rentBike(int hours) {
        if (available > 0) {
            moneyEarned += hours * hourPrice;
            available--;
            return true;
        }
        return false;
    }

    public void returnBike() {
        available++;
    }

    public void printStatus() {
        System.out.println("Available: " + available + ", earned = " + moneyEarned);
    }

    /**
     * Варианты ответа:
     * 1) Метод rentBike вернёт true, хотя велосипеда в наличии нет
     * 2) Метод rentBike вернёт false, хотя на пункте есть свободный велосипед
     * 3) В конце дня на балансе окажется меньше велосипедов, чем в начале дня
     * 4) В конце дня на балансе окажется больше велосипедов, чем в начале дня
     * 5) printStatus покажет неверную информацию
     * 6) При использовании класса возникнет ConcurrentModificationException
     *
     * Правильный ответ:
     * 1)
     * 2)
     * 3)
     * 4)
     * 5)
     * */
}
