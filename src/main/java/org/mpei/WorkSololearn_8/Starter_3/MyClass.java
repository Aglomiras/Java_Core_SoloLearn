package org.mpei.WorkSololearn_8.Starter_3;

public class MyClass {
    public static void main(String[] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2); // Запустите код
    }
    /**
     * Несмотря на то, что есть два объекта с одинаковыми именами, проверка на равенство возвращает ложь,
     * потому что эти два объекта разные (две разные ссылки или локации памяти).
     * */
}
