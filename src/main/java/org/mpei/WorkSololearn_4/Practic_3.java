package org.mpei.WorkSololearn_4;

public class Practic_3 {
    /**
     * Создание классов и объектов
     * Создайте программу для отображения сообщений загрузки пользователям приложения.
     * Определите класс Loading с одним общим методом, который называется LoadingMessage(), и должен выводить "Loading" при вызове.
     * Создайте объект с названием loading и вызовите его.
     *
     * Не забудьте использовать ключевое слово new при создании объекта.
     * */
    public static void main(String[] args) {
        Loading loading = new Loading();
        //создайте объект Loading с таким же именем
        loading.LoadingMessage();
    }
}

class Loading {
    void LoadingMessage() {
        System.out.println("Loading");
    }
    //завершите класс, добавьте метод LoadingMessage()
}
