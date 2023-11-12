package org.mpei.WorkSololearn_4;

public class Lecture_4_5 {
    /**
     * Давайте создадим метод, принимающий два параметра типа int и возвращающий наибольший из них, затем вызовем его в main:
     * */
    public static void main(String[ ] args) {
        int res = max(7, 42);
        System.out.println(res); //42
    }

    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    /**
     * Метод может иметь один тип параметра (или параметров) и возвращать другой, отличающийся тип.
     * Например, он может взять два double и вернуть int.
     * */
}
