package org.mpei.WorkSololearn_21.Practic_2;

import org.mpei.WorkSololearn_21.Convert;

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", 5, 3);
        Convert<Dog, Raccoon> convert = x -> new Raccoon(x.name, x.age, x.weight);

        Raccoon raccoon = convert.convert(dog);

        System.out.println(
                "Raccoon has parameters: name - " + raccoon.name +
                        ", age - " + raccoon.age +
                        ", weight - " + raccoon.weight
        );
    }
}
