package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_4 {
    /**
     * Атрибуты класса
     * Вы работаете администратором отеля и должны создать информационные карточки для новых клиентов.
     * В карточке необходимо указать имя и фамилию клиента, возраст и номер комнаты.
     * Данная программа соответствующим образом берет данные гостя (имя, фамилию, возраст и номер комнаты) в качестве вводных данных.
     * Завершите класс, добавив соответствующие атрибуты, чтобы метод saveCustomerInfo() работал корректно.
     * Атрибутам созданного объекта также должны быть присвоины значениям взятых данных.
     * <p>
     * Пример вводных данных
     * John Smith 35
     * 204
     * <p>
     * Пример результата
     * First name: John
     * Second name: Smith
     * Age: 35
     * Room number: 204
     * <p>
     * Будьте внимательны, присваивайте атрибутам правильные типы данных.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        //присвойте данные клиента атрибутам объекта
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
    }
}

class Customer {
    //добавьте все необходимые атрибуты здесь
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}