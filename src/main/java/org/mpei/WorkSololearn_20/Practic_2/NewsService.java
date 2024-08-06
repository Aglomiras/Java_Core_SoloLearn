package org.mpei.WorkSololearn_20.Practic_2;

public class NewsService {
    public static String getMessage() {
        try {
            Thread.currentThread().sleep(3000);
            return "Message";
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
