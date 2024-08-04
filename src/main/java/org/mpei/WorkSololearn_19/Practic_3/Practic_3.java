package org.mpei.WorkSololearn_19.Practic_3;

import java.util.Optional;

public class Practic_3 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Optional<Sugar> sugar = Optional.ofNullable(coffee.getSugar());
        int quantity = 0;
        if (sugar.isPresent()) {
            Sugar sugar1 = sugar.get();
            quantity = sugar1.getQuantity();
        }

        System.out.println(sugar.isPresent()); //false
        System.out.println("sugar: " + sugar); //Optional.empty
        System.out.println("quantity: " + quantity); //0

        /**
         * Глядя на этот пример, упаковка результата coffee.getSugar() в Optional, похоже,
         * не прибавляет никакой ценности, а скорее добавляет хлопот.
         * */
    }
}
