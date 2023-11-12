package org.mpei.WorkSololearn_9.Practic_3;

public class Circle extends Shape {
    int width;

    public Circle(int width) {
        this.width = width;
    }

    @Override
    void area() {
        System.out.println(Math.PI * width * width);
    }
}
