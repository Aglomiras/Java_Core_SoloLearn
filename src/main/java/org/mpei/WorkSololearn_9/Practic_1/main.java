package org.mpei.WorkSololearn_9.Practic_1;

public class main {
    /**
     * Перечисления
     * В нашей компьютерной игре-шутере 3 уровня сложности: EASY, MEDIUM, HARD.
     * На каждом из уровней игроку дается соответствующее количество патронов.
     * Данная программа определяет класс Player и перечисление Difficulty и создает 3 объекта
     * Player с различными уровнями сложности в качестве параметров конструктора.
     * Завершите конструктор Player, который использует перечисление в качестве параметра для проверки
     * количества патронов на каждом уровне сложности и выведет в результат соответствующее сообщение:
     * EASY => "You have 3000 bullets"
     * MEDIUM => "You have 2000 bullets"
     * HARD => "You have 1000 bullets"
     * <p>
     * Используйте выражение switch для проверки каждой опции перечисления и вывода в результат соответствующего сообщения.
     */
    public static void main(String[] args) {
        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);
    }
}
