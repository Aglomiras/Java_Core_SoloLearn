package org.mpei.WorkSololearn_21.Practic_5;

import java.util.ArrayList;

public class mainSupplier {
    public static void main(String[] args) {
        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Elena");
        namelist.add("Michael");
        namelist.add("David");
        namelist.add("Richard");
        namelist.add("Sara");

        Supplier<String> supplier = () -> {
            int value = (int) (Math.random() * namelist.size());
            return namelist.get(value);
        };

        System.out.println(supplier.get());
    }
}
