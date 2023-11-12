package org.mpei.WorkSololearn_5.Starter;

public class MyClass {
    public static void main(String[ ] args) {
        int x = 5;
        addOneTo(x);
        System.out.println(x);
    }
    static void addOneTo(int num) {
        num = num + 1;
    }
    /**
     * В вышеуказанном примере метод принимает значение его параметра, вот почему оригинальная переменная
     * не подвержена влиянию и ее значение остается равным 5.
     * */
}
