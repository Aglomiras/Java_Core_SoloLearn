package org.mpei.WorkSololearn_3;

public class Practic_1 {
    /**
     * Массивы
     * Ваша программа-календарь должна выводить все дни недели, но сейчас в ней есть ошибки.
     * Измените код таким образом, чтобы программа выводила соответствующий день.
     *
     * Обратите внимание, что мы используем литерал массива, так как мы уже знаем все элементы массива, который будем создавать.
     * */
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < 7; i++) {
            System.out.println(days[i]);
        }
    }
}
