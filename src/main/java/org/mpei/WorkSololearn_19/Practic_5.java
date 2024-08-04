package org.mpei.WorkSololearn_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Practic_5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());  // 1

        // список numbers пустой
        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        Optional<Integer> min1 = numbers1.stream().min(Integer::compare);
        System.out.println(min1.get());  // java.util.NoSuchElementException
    }
}
