package org.mpei.WorkSololearn_6.Starter_3;

public class main {
    public static void main(String[ ] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        /**
         * Мы создали две ссылочные переменные типа Animal, и указали их на объекты Cat и Dog. Теперь мы можем вызвать методы makeSound().
         * */
        a.makeSound();
        b.makeSound();
        /**
         * Так как ссылочная переменная a содержит объект Dog, будет вызван метод makeSound() класса Dog.
         * Так же происходит и с переменной b.
         *
         * Это показывает, что вы можете использовать переменную класса Animal, не зная что она содержит объект подкласса.
         * Это очень полезно, когда у вас множество подклассов одного суперкласса.
         * */
    }
}
