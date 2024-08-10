package org.mpei.WorkSololearn_15.Practic_12.Consumer;

import org.mpei.WorkSololearn_15.Practic_12.Broker.MessageBroker;
import org.mpei.WorkSololearn_15.Practic_12.Message.Message;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.currentThread;

public class MessageConsumer implements Runnable {
    private static final String MESSAGE_OF_MESSAGE_IS_CONSUMED = "Message '%s' is consumed.\n";
    private static final int SECOND_SLEEP_TIME = 3;
    private final MessageBroker messageBroker;

    public MessageConsumer(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        try {
            while (!currentThread().isInterrupted()) {
                TimeUnit.SECONDS.sleep(SECOND_SLEEP_TIME);
                final Message consumerMessage = this.messageBroker.consume();
                System.out.printf(MESSAGE_OF_MESSAGE_IS_CONSUMED, consumerMessage);
            }
        } catch (InterruptedException exception) {
            currentThread().interrupt();
        }
    }
}
