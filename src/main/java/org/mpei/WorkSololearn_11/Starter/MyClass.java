package org.mpei.WorkSololearn_11.Starter;

public class MyClass {
    public static void main(String[ ] args) {
        Loader obj = new Loader();
        obj.start();
    }
    /**
     * Как видите, наш класс Loader расширяет класс Thread и переопределяет его метод run().
     * Когда мы создаем объект obj и вызываем его метод start(), выражения метода run() выполняются на другом потоке.
     * */
}
