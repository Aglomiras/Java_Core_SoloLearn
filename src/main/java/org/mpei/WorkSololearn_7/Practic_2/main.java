package org.mpei.WorkSololearn_7.Practic_2;

public class main {
    /**
     * Интерфейсы
     * Вы любите животных и дома у вас живут собака и кошка.
     * Данная вам программа определяет абстрактный класс Animal, и классы Dog и Cat унаследованные от него.
     * Реализуйте интерфейсы Swimmer и Player и переопределите их методы swim() и play() таким образом, чтобы данные вызовы методов вывели в результат следующие сообщения:
     * swim():
     * Dog => "Dog is swimming"
     * Cat => "Cat is swimming"
     * play():
     * Dog => "Dog is playing"
     * Cat => "Cat is playing"
     *
     * Вы можете реализововать несколько интерфейсов, вписав их имена через запятую.
     * Реализуйте интерфейсы Swimmer and Player только в классе Animal, затем переопределите методы swim() и play() в унаследованных от него классах.
     * */
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        dog.play();
        cat.swim();
        cat.play();
    }
}
