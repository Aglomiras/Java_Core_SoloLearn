package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_7 {
    /**
     * Конструкторы
     * У вас есть друг, который работает кассиром в кинотеатре. Он знает, что вы круто программируете на java и попросил вас помочь ему,
     * создав программу, которая получит название фильма, ряд и номер места и печатает новый билет.
     * Завершите существующий код, добавив конструктор к классу Ticket, чтобы он был верно инициализирован.
     * <p>
     * Пример вводных данных
     * Jaws 5
     * 1
     * <p>
     * Пример результата
     * Movie: Jaws
     * Row: 5
     * Seat: 1
     * <p>
     * Вы можете определить параметры конструктора, проверив все типы данных, которые вы получаете из ввода.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();
        Ticket ticket = new Ticket(movie, row, seat);
        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {
    private String movie;
    private int row;
    private int seat;

    //завершите конструктор
    public Ticket(String movie, int row, int seat) {
        this.movie = movie;
        this.row = row;
        this.seat = seat;

    }

    public String getMovie() {
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}
