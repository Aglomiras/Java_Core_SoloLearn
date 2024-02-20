package org.mpei.WorkSololearn_14;

public class Practic_6 {
    /**Методы класса Thread*/
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Поток"));
        t.start();

        //Метод .join()
        //public final void join() throws InterruptedException
        t.join();
        System.out.println("Done");
        /**Запись в консоль "Done" появится ПОСЛЕ завершения System.out.println("Поток") в потоке t.*/

        //Метод .sleep()
        //public static void sleep(long millis) throws InterruptedException
        t.sleep(1000); // + try-catch
        /**Текущий поток засыпает на указанное количество миллисекунд.
         *
         * Оба метода требуют обработки исключения, и в коде часто сопровождаются блоком try-catch:
         * try {
         *     Thread.sleep(1000);
         * } catch (InterruptedException e) {
         *     throw new RuntimeException(e);
         * }
         * или использовать аннотацию @SneakyThrows.*/
    }
}
