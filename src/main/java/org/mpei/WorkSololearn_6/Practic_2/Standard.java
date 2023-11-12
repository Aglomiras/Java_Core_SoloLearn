package org.mpei.WorkSololearn_6.Practic_2;

public class Standard {
    /**
     * Наследование
     * Вы разрабатываете собственное приложение для редактирования фото.
     * Стандартная бесплатная версия позволяет рисовать и писать на фото.
     * По подписке на Pro версию доступны 2 дополнительных функции: применение эффектов (useEffects) и изменение разрешения (changeResolution).
     *
     * Завершите/замените код, чтобы наследовать класс Pro с класса Standard успешно завершить все вызовы методов.
     *
     * Будьте внимательны с модификаторами доступа.
     * */
    protected void draw() {
        System.out.println("Drawing");
    }

    protected void write() {
        System.out.println("Writing");
    }
}
