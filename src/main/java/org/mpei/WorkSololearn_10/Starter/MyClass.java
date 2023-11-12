package org.mpei.WorkSololearn_10.Starter;

public class MyClass {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
    /**
     * Без блока try/catch этот код разрушит программу, т.к. a[5] не существует.
     *
     * Обратите внимание на выражение (Exception e) в блоке catch - оно используется
     * для обработки всех возможных исключений.
     * */
}
