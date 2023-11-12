package org.mpei.WorkSololearn_13.Practic_4;

import java.util.Scanner;

public class Program {
    /**
     * Игра в боулинг
     * Вы создаете игру в боулинг!
     * Данный код объявляет класс Bowling с конструктором и методом addPlayer().
     * У каждого игрока есть имя и баллы, которые хранятся в HashMap игроков.
     * Код в main использует данные 3 игроков в качестве вводных данных и добавляет их в игру.
     * Вам необходимо добавить к классу метод getWinner(), который рассчитает и выведет в результат имя игрока с максимальным количеством баллов.
     * <p>
     * Пример вводных данных:
     * Dave 42
     * Amy 103
     * Rob 64
     * <p>
     * Пример результата:
     * Amy
     * <p>
     * Вам необходимо выполнить итерацию через HashMap, чтобы найти элемент с максимальным количество баллов и вывести соответствующий ключ.
     */
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
