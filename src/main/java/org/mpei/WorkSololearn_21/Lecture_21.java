package org.mpei.WorkSololearn_21;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Lecture_21 {
    public static void main(String[] args) {
        /**
         * Функциональные интерфейсы
         * Функциональным считается интерфейс с одним не реализованным (абстрактным) методом.
         * Такие интерфейсы обычно помечаются аннотацией @FunctionalInterface.
         * Аннотация @FunctionalInterface не является чем-то сверхсложным и важным,
         * так как её предназначение — сообщить компилятору, что данный интерфейс функциональный и
         * должен содержать не более одного метода. Если же в интерфейсе с данной аннотацией более
         * одного не реализованного (абстрактного) метода, компилятор не пропустит данный интерфейс,
         * так как будет воспринимать его как ошибочный код. Интерфейсы и без данной аннотации могут
         * считаться функциональными и будут работать, а  @FunctionalInterface является не более
         * чем дополнительной страховкой.
         *
         * Пример функционального интерфейса можно увидеть в Convert
         *
         * Давайте рассмотрим интерфейс Comparator, который является функциональным.
         * */
        Comparator comp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }

            @Override
            public Comparator reversed() {
                return Comparator.super.reversed();
            }

            @Override
            public Comparator thenComparing(Comparator other) {
                return Comparator.super.thenComparing(other);
            }

            @Override
            public Comparator thenComparingInt(ToIntFunction keyExtractor) {
                return Comparator.super.thenComparingInt(keyExtractor);
            }

            @Override
            public Comparator thenComparingLong(ToLongFunction keyExtractor) {
                return Comparator.super.thenComparingLong(keyExtractor);
            }

            @Override
            public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
                return Comparator.super.thenComparingDouble(keyExtractor);
            }

            @Override
            public Comparator thenComparing(Function keyExtractor) {
                return Comparator.super.thenComparing(keyExtractor);
            }

            @Override
            public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
                return Comparator.super.thenComparing(keyExtractor, keyComparator);
            }
        };
        /**
         * Можно увидеть, что у него не один метод, как было ранее заявлено.
         * Как же в таком случае он может считаться функциональным интерфейсом?
         * Функциональные интерфейсы могуть иметь методы, которые не входят в ограничения одного метода.
         * Речь идет о статических и дефолтных методах.
         *
         * Статические методы:
         * Статические методы привязаны конкретно к классу, и для вызова такого метода не нужен объект класса.
         *
         * Default методы:
         * Ранее мы говорили, что если нам требуется какой-то метод в интерфейсе, который наследовался бы
         * другими классами. Мы просто создавали нереализованный метод, который реализовывался в каждом конкретном
         * классе. Теперь представим ситуацию, что в каждом классе, который имплементирует данный интерфейс и
         * наследует от него нереализованный метод, этот метод должен быть у всех одинаков. Для таких случаев
         * обычно использовался абстрактный класс, но если мы хотим использовать именно интерфейс, что делать
         * в этом случае? Здесь и появляются методы по умолчанию (default).
         * При наследовании интерфейса можно переопределить эти методы или же оставить всё как
         * есть (оставить логику по умолчанию).
         *
         * Можно вновь вернуться к рассмотрению интерфейса Comparator, чтобы убедиться в этом.
         *
         * Теперь вопрос: а зачем же нам ограничение одним не реализованным методом в функциональном интерфейсе?
         * А затем, чтобы мы могли его реализовать с помощью лямбд.
         *
         * Пример в Practic_2
         *
         *
         * Теперь можно поговорить о базовых функциональных интерфейсах.
         * 1) Predicate — функциональный интерфейс для проверки соблюдения некоторого условия.
         * Если условие соблюдается, возвращает true, иначе — false.
         *
         * 2) Consumer (с англ. — “потребитель”) — функциональный интерфейс, который принимает в качестве входного
         * аргумента объект типа T, совершает некоторые действия, но при этом ничего не возвращает.
         *
         * 3) Supplier (с англ. — поставщик) — функциональный интерфейс, который не принимает никаких аргументов,
         * но возвращает некоторый объект типа T.
         *
         * 4) Function — этот функциональный интерфейс принимает аргумент T и приводит его к объекту типа R,
         * который и возвращается как результат.
         *
         * 5) UnaryOperator — функциональный интерфейс, принимает в качестве параметра объект типа T, выполняет над
         * ним некоторые операции и возвращает результат операций в виде объекта того же типа T.
         *
         * Каждый из интерфейсов рассмотрен в Practic_3 - Practic_7*/
    }
}
