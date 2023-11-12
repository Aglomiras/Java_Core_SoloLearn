package org.mpei.WorkSololearn_4;

import java.util.Scanner;

public class Practic_6 {
    /**
     * Методы Getter и Setter
     * Данная программа принимает имя и возраст студента в качестве вводных данных.
     * Завершите программу так, чтобы она установила значения для соответствующих атрибутов класса Student и вывела итоговый результат.
     * Если возраст <0, то программа должна вывести "Invalid age" и закрепить за атрибутом возраста значение 0.
     *
     * Пример вводных данных
     * Olivia
     * -2
     *
     * Пример результата
     * Invalid age
     * Name: Olivia
     * Age: 0
     *
     * Пояснение
     * -2 недопустимое значение для атрибута возраста, поэтому в результат выводится "Invalid age" и "Age: 0". Это должно быть выполнено методами Setter и Getter.
     *
     * Вам необходимо обрабатывать условия внутри методов Getter и Setter.
     * */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);

        //установите возраст через метод Setter
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
}
class Student {
    public String name;
    private int age;
    public int getAge() {
        return age;
    }
    //завершите метод Getter
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            this.age = 0;
        } else {
            this.age = age;
        }
        //завершите метод Setter
    }
}
