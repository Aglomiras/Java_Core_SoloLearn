package org.mpei.WorkSololearn_19.Practic_3;

public class Coffee {
    private Sugar sugar;

    public Sugar getSugar() {
        return sugar;
    }

    public void setSugar(Sugar sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "sugar=" + sugar +
                '}';
    }
}
