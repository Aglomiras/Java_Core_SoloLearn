package org.mpei.WorkSololearn_19.Practic_3;

public class Sugar {
    private int Quantity;

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "Quantity=" + Quantity +
                '}';
    }
}
