package org.mpei.WorkSololearn_21.Practic_6;

public class mainFunction {
    public static void main(String[] args) {
        Function<String, Integer> valueConvert = x -> Integer.valueOf(x);
        System.out.println(valueConvert.apply("123").getClass());
    }
}
