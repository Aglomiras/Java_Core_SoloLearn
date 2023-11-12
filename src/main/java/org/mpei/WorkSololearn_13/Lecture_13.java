package org.mpei.WorkSololearn_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Lecture_13 {
    public static void main(String[] args) {
        /**
         * -----РАБОТА С ФАЙЛАМИ-----
         * Пакет java.io включает в себя класс File, который позволяет вам работать с файлами.
         * Чтобы начать, создайте объект File и укажите путь к файлу в конструкторе.
         * */
        File file = new File("C:\\Users\\Aglomiras\\IdeaProjects\\Java_Core_SoloLearn\\src\\main\\java\\org\\mpei\\WorkSololearn_13\\file.txt");
        /**
         * С помощью метода exists(), вы можете определить, существует ли файл.
         * */
        if (file.exists()) {
            System.out.println(file.getName() + "exists!");
        } else {
            System.out.println("The file does not exist");
        }
        /**
         * Вышеуказанный код выводит сообщение о том, существует, или нет, файл, по указанному вами пути.
         *
         * Метод getName() возвращает имя файла.
         * Обратите внимание, что мы использовали двойные обратные косые черты (слэши) в пути,
         * потому что одинарные слэши будут опущены в строке пути к файлу.
         * */
        System.out.println(file.getName()); // file.txt
        /**
         * -----ЧТЕНИЕ ФАЙЛА-----
         * Файлы полезны для хранения и получения информации, и существует множество способов чтения файлов.
         * Одним из простейших способов является использование класса Scanner из пакета java.util.
         * Конструктор класса Scanner может принимать объект File в качестве ввода.
         * Для чтения содержимого текстового файла, лежащего в "C:\\sololearn\\test.txt",
         * нам необходимо создать объект File с соответствующим путем и передать его объекту Scanner.
         * */
        try {
            File x = new File("C:\\Users\\Aglomiras\\IdeaProjects\\Java_Core_SoloLearn\\src\\main\\java\\org\\mpei\\WorkSololearn_13\\file.txt");
            Scanner sc = new Scanner(x);
        } catch (FileNotFoundException e) {

        }
        /**
         * Мы окружили код блоком try/catch, потому что существует вероятность, что файл не будет существовать.
         * Класс Scanner наследуется от класса Iterator, так что он ведет себя похожим образом.
         * Мы можем использовать метод next() объекта Scanner для чтения содержимого файла.
         * */
        try {
            File x1 = new File("C:\\Users\\Aglomiras\\IdeaProjects\\Java_Core_SoloLearn\\src\\main\\java\\org\\mpei\\WorkSololearn_13\\file.txt");
            Scanner sc1 = new Scanner(x1);
            while (sc1.hasNext()) {
                System.out.println(sc1.next());
            }
            sc1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        /**
         * Содержимое файла будет выводится слово за словом, потому что метод next() возвращает каждое слово отдельно.
         * Закрывать файл после завершения работы с ним всегда является хорошей практикой. Одним из способов этого является метод close().
         *
         * -----СОЗДАНИЕ ФАЙЛОВ-----
         * Formatter, другой полезный класс в пакете java.util, используется для создания содержимого и записи его в файлы.
         * */
        try {
            Formatter f = new Formatter("C:\\Users\\Aglomiras\\IdeaProjects\\Java_Core_SoloLearn\\src\\main\\java\\org\\mpei\\WorkSololearn_13\\file.txt");
        } catch (Exception e) {
            System.out.println("Error");
        }
        /**
         * Таким образом создается пустой файл по указанному пути. Если файл уже существует, то он будет переписан.
         * И опять, вам необходимо окружить код блоком try/catch, потому что операция может закончиться неудачей.
         *
         * После того, как файл был создан, вы можете записать содержимое в него, используя метод format() объекта Formatter.
         * */
        try {
            Formatter f = new Formatter("C:\\Users\\Aglomiras\\IdeaProjects\\Java_Core_SoloLearn\\src\\main\\java\\org\\mpei\\WorkSololearn_13\\file.txt");
            f.format("%s %s %s", "1", "John", "Smith \r\n");
            f.format("%s %s %s", "2", "Amy", "Brown");
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        /**
         * Метод format() форматирует его параметры согласно с первым параметром.
         * %s означает строку и заменяется первым параметром после метода format. Второй %s заменяется следующим параметром
         * и так далее. Значит, формат %s %s %s означает три строки, разделенные пробелами.
         * Обратите внимание: \r\n это символ новой строки в Windows.
         *
         * Вышеуказанный код создает файл со следующим содержимым:
         * 1 John Smith
         * 2 Amy Brown
         * Не забывайте закрывать файлы, после того, как вы закончили с ними работать!
         * */
    }
}
