package org.mpei.WorkSololearn_7.Practic_1;

public class main {
    /**
     * Абстрактные классы
     * Каждый год компания выпускает новую настольную игру. Хотя в каждой игре правила отличаются, всех их объединяет то, что у каждой
     * есть название и метод play(). Нам нужно создать 3 разных игры: Монополия, Шахматы и Военные корабли. В методе play(),
     * Монополии необходимо выводить “Buy all property.”, Военным кораблям - “Sink all ships”, а Шахматам - “Kill the enemy king.”
     * Завершите код, внедрив методы getName() и play(), унаследованные от абстрактного класса Game.
     *
     * Чтобы дать играм названия, просто верните строку с названием в функцию getName().
     * */
    public static void main(String[] args) {
        //не меняйте этот код
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();

        monopoly.play();
        chess.play();
        battleships.play();
    }
}
