package org.mpei.WorkSololearn_19;

import org.mpei.WorkSololearn_19.Practic_3.Coffee;

import java.util.Optional;

public class Practic_4 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        Integer quantity = Optional.ofNullable(coffee.getSugar())
                .map(it -> it.getQuantity())
                .orElse(0);

        /**
         * Метод вернет значение, содержащееся в экземпляре Optional. Но если параметр Optional пуст,
         * то есть он не содержит значения, тогда orElse() вернет значение, переданное в сигнатуру его метода,
         * которое известно как значение по умолчанию.
         * */

        System.out.println(quantity); //0

        /**
         * Теперь, если в случае пустого значения мы не хотим возвращать значение по умолчанию,
         * то нам нужно создать какое-то исключение.
         * */

        Coffee coffee1 = new Coffee();

        Integer quantity1 = Optional.ofNullable(coffee1.getSugar())
                .map(it -> it.getQuantity())
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(quantity1);

        /**
         * Как видите, Optional дает несколько преимуществ:
         * - абстрагирует проверки null;
         * - предоставляет API для обработки объектов null;
         * - позволяет декларативному подходу выражать то, что достигается;
         * */
    }
}
