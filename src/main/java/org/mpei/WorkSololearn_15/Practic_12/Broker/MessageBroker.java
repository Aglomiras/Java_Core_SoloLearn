package org.mpei.WorkSololearn_15.Practic_12.Broker;

import org.mpei.WorkSololearn_15.Practic_12.Message.Message;

import java.util.ArrayDeque;
import java.util.Queue;

import static java.lang.Thread.currentThread;

public final class MessageBroker {
    private final Queue<Message> messagesToBeConsumed;
    private final int maxStoreMessage;

    public MessageBroker(final int maxStoreMessage) {
        this.messagesToBeConsumed = new ArrayDeque<>(maxStoreMessage);
        this.maxStoreMessage = maxStoreMessage;
    }

    public synchronized void produce(final Message message) {
        while (messagesToBeConsumed.size() >= maxStoreMessage) {
            try {
                super.wait();
            } catch (InterruptedException exception) {
                currentThread().interrupt();
            }
        }
        this.messagesToBeConsumed.add(message);
        super.notify();
    }

    public synchronized Message consume() {
        while (this.messagesToBeConsumed.isEmpty()) {
            try {
                super.wait();
            } catch (InterruptedException exception) {
                currentThread().interrupt();
                throw new RuntimeException();
            }
        }
        final Message message = this.messagesToBeConsumed.poll();
        super.notify();
        return message;
    }
}
