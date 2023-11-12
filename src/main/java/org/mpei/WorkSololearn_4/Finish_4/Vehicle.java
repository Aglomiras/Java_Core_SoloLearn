package org.mpei.WorkSololearn_4.Finish_4;

public class Vehicle {
    private String color;
    Vehicle() {
        this.setColor("Red");
    }
    Vehicle(String c) {
        this.setColor(c);
    }
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
    /**
     * Вышеуказанный класс имеет два конструктора, первый, без параметров, устанавливает значение по умолчанию атрибута color на "Red",
     * и второй конструктор, который принимает параметры и присваивает их к атрибутам.
     * Теперь, мы можем использовать конструкторы для создания объектов нашего класса.
     * */
}
