package org.mpei.WorkSololearn_10.Practic_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Множественные исключения
     * Вам необходимо написать программу-делитель, которая будет работать с целыми числами.
     * Данная вам программа должна в качестве вводных данных взять два целых числа и выполнить деление, но нам нужно обработать два исключения:
     * 1. делитель не должен быть равен 0
     * 2. оба введенных числа должны быть целыми цифрами.
     * Завершите программу для выполнения задачи.
     * Для первого исключения программа должна вывести фразу "Mistake: division by zero"; для второго - "Mistake: wrong value type".
     * <p>
     * Пример вводных данных
     * 1
     * b
     * <p>
     * Пример результата
     * Mistake: wrong value type
     * <p>
     * Используйте ArithmeticException для первого исключения и InputMismatchException для второго.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
	        /*
	        1. Еrror: division by zero
	        2. Error: wrong value type
	        */
            //введите код сюда
        } catch (ArithmeticException e) {
            System.out.println("Mistake: division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Mistake: wrong value type");
        }
    }
}
