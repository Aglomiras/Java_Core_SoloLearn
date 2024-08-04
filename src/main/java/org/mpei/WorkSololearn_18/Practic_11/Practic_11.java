package org.mpei.WorkSololearn_18.Practic_11;

import java.util.LinkedList;

public class Practic_11 {
    public static void main(String[] args) {
        LinkedList<Double> listLink = new LinkedList<>();
        int sizeList = 4;

        Thread prod = new Thread(new Producer(listLink, sizeList), "Producer");
        Thread cons = new Thread(new Consumer(listLink), "Consumer");
        prod.start();
        cons.start();

    }
}
