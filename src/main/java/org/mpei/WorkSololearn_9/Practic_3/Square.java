package org.mpei.WorkSololearn_9.Practic_3;

public class Square extends Shape {
    int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(width * width);
    }
}
