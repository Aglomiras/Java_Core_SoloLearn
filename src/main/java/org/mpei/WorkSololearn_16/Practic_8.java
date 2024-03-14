package org.mpei.WorkSololearn_16;

public class Practic_8 {
    /**
     * Тестовый вопрос №2:
     Рассмотрим более реальный пример - метод hashCode в классе String:

     public class String {

         private int hash;
         private boolean hashIsZero;

         public int hashCode() {
             int h = hash;
             if (h == 0 && !hashIsZero) {
                 h = isLatin1() ? StringLatin1.hashCode(value)
                 : StringUTF16.hashCode(value);
                 if (h == 0) {
                    hashIsZero = true;
                 } else {
                    hash = h;
                 }
             }
             return h;
         }
     }
     Предположим, что экземпляр String str доступен нескольким потокам, и они одновременно вызвали метод str.hashCode()
     Что при этом может произойти?

     Варианты ответа:
     1) Получим два разных хэшкода в разных частях приложения;
     2) Значение hashcode будет посчитано несколько раз;
     3) Хэшкод будет посчитан некорректно;
     4) Будет выброшен ConcurrentModificationException;
     5) Всё будет ок, хэшкод посчитается один раз;

     Правильный ответ:
     2)
     */

}
