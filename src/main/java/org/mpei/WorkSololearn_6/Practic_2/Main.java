package org.mpei.WorkSololearn_6.Practic_2;

public class Main {
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro1 = new Pro();

        //стандартная версия
        standard1.draw();
        standard1.write();

        //Pro версия
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}
