package org.mpei.WorkSololearn_8;

public class Lecture_8 {
    public static void main(String[] args) {
        /**
         * -----ПРИВЕДЕНИЕ ТИПОВ-----
         * Присваивание значения одного типа к переменной другого типа известно как Приведение Типов.
         * Чтобы привести значение к специфическому типу, разместите тип в скобках перед значением.
         * */
        int a = (int) 3.14;
        System.out.println(a);
        /**
         * В вышеуказанном примере значение 3.14 приводится к типу int, в результате получается значение 3.
         * */
        double a1 = 42.571;
        int b = (int) a1;
        System.out.println(b);
        /**
         * Java поддерживает автоматическое приведение типа для целочисленных переменных к типу с плавающей точкой, потому что отсутствует потеря точности.
         * С другой стороны, приведение типа является обязательным при присваивании значений с плавающей точкой к целочисленным переменным.
         *
         * -----ПРИВЕДЕНИЕ ТИПОВ КЛАССОВ-----
         * Для классов существует два типа приведения.
         *
         * [h2]Восходящее приведение[/h2]
         * Вы можете привести экземпляр подкласса к его суперклассу.
         * Рассмотрим следующий пример, считая, что класс Cat является подклассом класса Animal.
         * Пример рассмотрен в папке Starter
         *
         * [h2]Нисходящее приведение[/h2]
         * Приведение объекта суперкласса к его подклассу называется нисходящим.
         * Пример рассмотрен в папке Starter
         *
         * Почему восходящее приведение является автоматическим, а нисходящее ручным? Что ж, восходящее приведение никогда
         * не может потерпеть неудачу. Но если у вас есть группа различных классов Animal и вы хотите нисходяще привести их всех к классу Cat,
         * то будет шанс, что некоторые из этих классов Animal являются в действительности классами Dog, и процесс обернется ошибкой.
         *
         * -----АНОНИМНЫЕ КЛАССЫ-----
         * Анонимные классы являются способом расширения существующих классов налету.
         * Например, рассмотрим класс Machine.
         * Пример рассмотрен в папке Starter_1
         *
         * Аннотация @Override используется, чтобы сделать ваш код более легким для понимания,
         * потому что становится понятным, что методы были переопределены.
         *
         * -----ВНУТРЕННИЕ КЛАССЫ-----
         * Java поддерживает внутренние классы; класс может быть членом другого класса.
         *
         * Создать внутренний класс достаточно просто. Просто напишите класс внутри класса.
         * В отличие от класса, внутренний класс может быть приватным. Как только вы объявите внутренний класс приватным,
         * к нему не сможет быть получен доступ от объектов лежащих вне класса.
         * Пример рассмотрен в папке Starter_2
         * */
        /**
         * -----СРАВНЕНИЕ ОБЪЕКТОВ-----
         * Не забывайте, что когда вы создаете объекты, переменные сохраняют ссылки на объекты.
         * Значит, когда вы сравниваете объекты с помощью оператора проверки на равенство (==),
         * то в действительности он сравнивает ссылки, а не значения объектов.
         * Пример доказывающий это представлен в папке Starter_3
         *
         * -----equals()-----
         * Каждый объект имеет предопределенный метод equals(), который используется для семантической проверки на равенство.
         * Но, чтобы он работал для наших классов, нам необходимо переопределить его и проверить необходимые условия.
         * Существует простой и быстрый способ генерации метода equals(), вместо написания его вручную.
         * Просто нажмите правой кнопкой мыши на вашем классе, перейдите в Source->Generate hashCode() and equals()...
         * Таким образом будут автоматически созданы необходимые методы.
         * Пример рассмотрен в папке Starter_4
         *
         * Вы можете использовать то же самое меню, чтобы сгенерировать другие полезные методы, такие как getter и setter для ваших атрибутов класса.
         * */
    }
}
