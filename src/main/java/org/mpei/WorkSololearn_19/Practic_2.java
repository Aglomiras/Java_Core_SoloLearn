package org.mpei.WorkSololearn_19;

import java.util.Objects;
import java.util.Optional;

public class Practic_2 {
    public static void main(String[] args) {
        String name = "Java";
        Optional<String> strName = Optional.of(name);
        Integer count = null;
        Optional<Integer> intCount = Optional.ofNullable(count);

        Optional<Object> objOpti = Optional.empty();

        System.out.println("strName: " + strName + " = " + name);
        System.out.println("intCount: " + intCount + " = " + count);
        System.out.println("objOpti: " + objOpti + " = " + objOpti);
    }
}
