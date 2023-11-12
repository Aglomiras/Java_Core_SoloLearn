package org.mpei.WorkSololearn_8.Starter_1;

public class main {
    public static void main(String[] args) {
        Machine m = new Machine() {
            @Override
            public void start() {
                System.out.println("Wooooo");
            }
        };
        m.start();

        /**
         * После вызова конструктора, мы открыли фигурные скобки и переопределили реализацию метода start.
         *
         * Модификация применима только к текущему объекту, а не к самому классу. Значит, если мы создадим другой объект
         * класса, то реализация метода start будет такой, как определено в классе.
         * */
        Machine m2 = new Machine();
        m2.start(); // Запусти код
    }
}
