package org.mpei.WorkSololearn_10.Starter_1;

public class Main {
    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(42, 0));
    }
    /**
     * Выражение throws в описании метода определяет тип исключения, которое может выбрасывать метод.
     * Далее, ключевое слово throw бросает соответствующее исключение, вместе с определенным сообщением.
     * Если мы вызовем метод div со вторым параметром равным 0, то он выбросит исключение ArithmeticException с сообщением "Division by Zero"(Деление на Ноль).
     *
     * Множество исключений может быть определено в выражении throws с помощью разделения запятыми.
     * */
}
