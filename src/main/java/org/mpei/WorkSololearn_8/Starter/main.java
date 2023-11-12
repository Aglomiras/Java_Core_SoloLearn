package org.mpei.WorkSololearn_8.Starter;

public class main {
    public static void main(String[] args) {
        Animal a = new Cat();
        ((Cat) a).makeSound();
    }
    /**
     * Java автоматически выполнил восходящее приведение переменной типа Cat к типу Animal.
     * Будет совершена попытка приведения переменной a к типу Cat и вызова его метода makeSound().
     * */
}
