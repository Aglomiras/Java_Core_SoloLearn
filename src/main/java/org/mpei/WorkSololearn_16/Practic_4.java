package org.mpei.WorkSololearn_16;

public class Practic_4 {
    /**
     * Двум потокам доступна переменная value. Один поток её увеличивает, другой следит за изменениями:
     */
    public static int value;

    public static void main(String[] args) {

        // Читаем значение переменной
        Thread reader = new Thread(() -> {
            int temp = 0;
            while (true) {
                if (temp != value) {
                    temp = value;
                    System.out.println("value = " + value);
                }
            }
        });
        reader.setDaemon(true); // чтобы завершить программу после выполнения writer

        // Обновляем значение переменной
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                value++;
                System.out.println("value updated: " + value);
                try {
                    Thread.sleep(1000); // + try-catch
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            // Немного ждём
            try {
                Thread.sleep(5000); // + try-catch
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        reader.start();
        writer.start();
    }
    /**
     * Что мы ожидаем:
     * value updated: 1
     * value = 1
     * value updated: 2
     * value = 2
     * value updated: 3
     * value = 3
     * value updated: 4
     * value = 4
     * value updated: 5
     * value = 5
     *
     * Что мы увидим:
     * value updated: 1
     * value = 1
     * value updated: 2
     * value updated: 3
     * value updated: 4
     * value updated: 5
     * */
}
