package org.mpei.WorkSololearn_4;

public class Lecture_4_3 {
    class MyClass {

        static int sum(int val1, int val2) {
            return val1 + val2;
        }

        public static void main(String[ ] args) {
            int x = sum(2, 5);
            System.out.println(x);
        }
    }
    /**
     * Т.к. метод возвращает значение, мы можем присвоить его переменной.
     * Если вам не нужно возвращать какое-либо значение из вашего метода – используйте ключевое слово void.
     * Обратите внимание на ключевое слово void в определении метода main – это значит, что метод main ничего не возвращает.
     * */
}
