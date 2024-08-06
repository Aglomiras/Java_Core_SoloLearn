package org.mpei.WorkSololearn_21.Practic_4;

public class mainConsumer {
    public static void main(String[] args) {
        Consumer<String> greeting = x -> System.out.println("Hello " + x + " !!!");
        greeting.accept("Elena");
    }
}
