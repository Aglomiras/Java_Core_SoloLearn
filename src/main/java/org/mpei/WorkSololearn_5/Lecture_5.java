package org.mpei.WorkSololearn_5;

public class Lecture_5 {
    public static void main(String[] args) {
        /**
         * -----ЧИСЛОВЫЕ ТИПЫ-----
         * Числовой тип является базовым типом и включает в себя типы byte, short, int, long, float, double, boolean, и char.
         * Эти типы данных хранят в себе значения, присвоенные им в соответствующих участках памяти.
         *
         * Следовательно, при передаче их в метод, вы оперируете над значениями переменных, а не над самими переменными.
         * Пример рассмотрен в папке Starter
         *
         * -----ССЫЛОЧНЫЙ ТИП-----
         * Ссылочный тип хранит ссылку (или адрес) на участок памяти, в котором хранится соответствующая информация.
         * При создании объекта с помощью конструктора вы создаете переменную ссылочного типа.
         *
         * Для примера рассмотрим определенный класс Person.
         * Пример рассмотрен в папке Starter_1
         *
         * -----КЛАСС Math-----
         * JDK определяет множество полезных классов, одним из них является класс Math, который предоставляет предопределенные методы для математических операций.
         * Вам не нужно создавать объект класса Math для его использования. Чтобы получить к нему доступ, введите Math. и соответствующий метод.
         *
         * Math.abs() возвращает абсолютное значение его параметра.
         * */
        int a = Math.abs(10);  // 10
        int b = Math.abs(-20); // 20
        /**
         * Math.ceil() округляет значение с плавающей точкой к ближайшему наибольшему целому значению.
         * Округленное значение возвращается с типом double.
         * */
        double c = Math.ceil(7.342);  // 8.0
        /**
         * Подобным образом, Math.floor() округляет значение с плавающей точкой к ближайшему наименьшему целому числу.
         * */
        double f = Math.floor(7.343);  // 7.0
        /**
         * Math.max() возвращает наибольший из его параметров.
         * */
        int m = Math.max(10, 20);  // 20
        /**
         * И наоборот, Math.min() возвращает наименьший параметр.
         * */
        int n = Math.min(10, 20);  // 10
        /**
         * Math.pow() принимает два параметра и возвращает первый параметр, возведенный в степень вторым параметром.
         * */
        double p = Math.pow(2, 3); // 8.0
        /**
         * Существует множество других доступных методов класса Math, включая:
         * sqrt() для квадратного корня, sin() для синуса, cos() для косинуса, и другие.
         * */
        /**
         * -----Static-----
         * Если вы объявляете переменную или метод с ключевым словом static, то они будут принадлежать классу, а не какому-либо экземпляру.
         * Это значит, что существует только один экземпляр static, даже если вы создадите множество объектов класса, или не создадите ни одного.
         * Он будет разделен всеми объектами.
         * Пример с Static рассмотрен в папке Starter_2
         *
         * Такой же принцип применяется к статическим методам.
         * Другим примером статических методов являются методы класса Math, что объясняет, почему вы можете вызвать их, не создавая объекты класса Math.
         * Также, метод main должен всегда быть статическим.
         *
         * -----final-----
         * Используйте ключевое слово final, чтобы обозначить константную переменную, которая может быть присвоена только один раз.
         * Пример рассмотрен в папке Starter_3
         *
         * -----ПАКЕТЫ (Packages)-----
         * Пакеты используются для избежания конфликта имен и для управления доступом к классам.
         * Пакет может быть определен в виде собранной группы классов похожего типа, вместе с под-пакетами.
         * Создать пакет в Java очень легко. Просто нажмите правой кнопкой мыши на вашей директории src и нажмите New->Package.
         * Дайте вашему пакету имя и нажмите Finish.
         *
         * Вы заметите, что появился новый пакет в директории проекта. Теперь вы можете перемещать классы в пакет и создавать там новые.
         * Мы переместили наши классы Vehicle, Counter и Animal в пакет samples.
         *
         * Когда вы перемещаете/создаете класс в вашем пакете, следующий код появится вверху списка файлов.
         * package samples;
         *
         * Таким образом обозначается пакет, к которому принадлежит класс.
         * Теперь, нам необходимо импортировать классы, находящиеся в пакете в нашем main, чтобы их можно было использовать.
         *
         * Возникает два основных результата, когда класс размещается в пакете. Первый, имя пакета становится частью имени класса.
         * Второй, имя пакета должно соответствовать структуре директории, где находится соответствующий файл класса.
         *
         * Используйте подстановку для импорта всех классов в пакет.
         * Например, import samples.* импортирует все классы в пакет samples.
         * */
    }
}
