package org.mpei.WorkSololearn_19.Practic_1;

public class Practic_1 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Integer quantity = coffee.getSugar().getQuantity();

        //Одинз вариантов решения данной проблемы (получения NullPointerException)
        /**
        Coffee coffee = new Coffee();
        Integer quantity = 0;
        if (coffee.getSugar() != null) {
            quantity = coffee.getSugar().getQuantity();
        }
        */

    }
}
