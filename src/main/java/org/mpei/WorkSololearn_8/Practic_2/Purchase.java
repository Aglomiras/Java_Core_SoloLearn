package org.mpei.WorkSololearn_8.Practic_2;

public class Purchase {
    int price;

    public int totalAmount(int price) {
        return price - (price * 10) / 100;
    }
}
