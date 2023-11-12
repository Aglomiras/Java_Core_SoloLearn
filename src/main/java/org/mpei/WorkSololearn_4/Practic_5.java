package org.mpei.WorkSololearn_4;

public class Practic_5 {
    /**
     * Модификаторы доступа
     * Вы тур-менеджер, и вам нужен список стран с указанием их столиц.
     * Вам дана программа, которая создает объект Country, и нужно вывести название и столицу, но что-то пошло не так.
     *
     * Задача
     * Измените модификаторы доступа для полей класса Country, чтобы получить требуемые выходные данные.
     *
     * Используйте модификатор доступа public для предоставления доступа к любым другим классам.
     * */
    public static void main(String[] args) {
        Country c = new Country();
        c.name = "France";
        c.capital = "Paris";
        System.out.println("Country:  " + c.name);
        System.out.println("Capital:  " + c.capital);
    }

}
class Country{
    //измените код ниже
    public String name;
    public String capital;
}
