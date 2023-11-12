package org.mpei.WorkSololearn_6.Practic_1;

public class Pupil {
    private int age;

    //Завершите setter method
    public void setAge(int a) {
        if (a <= 6) {
            this.age = a;
            System.out.println("Sorry");
        } else {
            this.age = a;
            System.out.println("Welcome");
        }
    }

    public int getAge() {
        return age;
    }
}
