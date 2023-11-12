package org.mpei.WorkSololearn_5.Starter_1;

public class MyClass {
    public static void main(String[ ] args) {
        Person j;
        j = new Person("John");
        j.setAge(20);
        celebrateBirthday(j);
        System.out.println(j.getAge());
    }
    static void celebrateBirthday(Person p) {
        p.setAge(p.getAge() + 1);
    }
    /**
     * Метод celebrateBirthday принимает объект Person в качестве его параметра, и инкрементирует его атрибут.
     * Из-за того, что переменная j имеет ссылочный тип, метод действует на сам объект, и способен изменить действительное значение его атрибута.
     * Массивы и Ссылки имеют ссылочный тип.
     * */
}
