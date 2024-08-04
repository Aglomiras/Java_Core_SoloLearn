package org.mpei.WorkSololearn_21.Practic_7;

public class mainUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> squareValue = x -> x * x;
        System.out.println(squareValue.applay(9));
    }
}
