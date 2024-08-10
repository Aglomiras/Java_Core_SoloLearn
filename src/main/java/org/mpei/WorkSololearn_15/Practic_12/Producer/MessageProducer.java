package org.mpei.WorkSololearn_15.Practic_12.Producer;

import org.mpei.WorkSololearn_15.Practic_12.Broker.MessageBroker;
import org.mpei.WorkSololearn_15.Practic_12.Message.Message;

import java.util.concurrent.TimeUnit;

import static java.lang.String.format;
import static java.lang.Thread.currentThread;

public class MessageProducer implements Runnable {
    private static final String MESSAGE_OF_MESSAGE_IS_PRODUCED = "Message '%s' is produced.\n";
    private static final int SECOND_SLEEP_TIME = 1;

    private final MessageBroker messageBroker;
    private final MessageFactory messageFactory;

    public MessageProducer(final MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
        this.messageFactory = new MessageFactory();
    }

    private static final class MessageFactory {
        private static final int INITIAL_NEXT_MESSAGE_INDEX = 1;

        private int nextMessageIndex;

        public MessageFactory() {
            this.nextMessageIndex = INITIAL_NEXT_MESSAGE_INDEX;
        }

        private static final String TEMPLATE_CREATED_MESSAGE_DATA = "Message#%d";

        public Message createMessage() {
            return new Message(format(TEMPLATE_CREATED_MESSAGE_DATA, this.nextMessageIndex++));
        }
    }

    @Override
    public void run() {
        try {
            while (!currentThread().isInterrupted()) {
                final Message producerMessage = this.messageFactory.createMessage();
                TimeUnit.SECONDS.sleep(SECOND_SLEEP_TIME);
                this.messageBroker.produce(producerMessage);
                System.out.printf(MESSAGE_OF_MESSAGE_IS_PRODUCED, producerMessage);
            }
        } catch (InterruptedException exception) {
            currentThread().interrupt();
        }
    }
}
