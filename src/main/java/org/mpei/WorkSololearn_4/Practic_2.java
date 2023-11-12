package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_2 {
    /**
     * Возвращаемый Тип Методов
     * Вы – ассистент на ТВ-шоу, где звезды танцуют, а 4 члена жюри ставят им оценки по шкале от 1 до 10.
     * Данная программа берет оценки в качестве вводных данных.
     * Завершите метод, где они будут использоваться в качестве параметров, затем вычислите и выведите в результат средний бал.
     *
     * Пример вводных данных
     * 6.0
     * 4.0
     * 5.0
     * 3.0
     *
     * Пример результата
     * 4.5
     *
     * Чтобы вычислить средний бал, сложите все оценки и разделите их сумму на количество оценок.
     * */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);
    }
    //завершите метод
    public static double getAverageScore(double a, double b, double c, double d) {
        return (a+b+c+d)/4;
    }
    /**
     * -----СОЗДАНИЕ КЛАССОВ-----
     * Чтобы создать свои собственные объекты, вам необходимо сперва создать соответствующие классы.
     * Это выполняется с помощью нажатия правой кнопкой мыши на папке src в Eclipse и выбора Create->New->Class.
     * Назовите ваш класс и нажмите Finish, чтобы добавить новый класс в ваш проект:
     * Данный пример будет разобран в папке Finish.
     * */
}
