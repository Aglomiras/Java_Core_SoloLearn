package org.mpei.WorkSololearn_21.Practic_3;

public class mainPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEventNumber = x -> x % 2 == 0;
        System.out.println(isEventNumber.test(1));
        System.out.println(isEventNumber.test(2));
    }
}
