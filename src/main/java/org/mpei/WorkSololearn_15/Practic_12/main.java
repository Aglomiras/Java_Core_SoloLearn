package org.mpei.WorkSololearn_15.Practic_12;

import org.mpei.WorkSololearn_15.Practic_12.Broker.MessageBroker;
import org.mpei.WorkSololearn_15.Practic_12.Consumer.MessageConsumer;
import org.mpei.WorkSololearn_15.Practic_12.Producer.MessageProducer;

public class main {
    /**
     * Необходимо создать программу, которая будет содержать в себе:
     * - MessageProducer - который будет передавать сообщение MessageBroker;
     * - MessageBroker - который будет хранить в себе все сообщения;
     * - MessageConsumer - который будет принимать сообщения из MessageBroker;
     *
     * MessageBroker может хранить в себе максимально только пять сообщений.
     * */
    public static void main(String[] args) {
        final int brokerMaxStoreBroker = 5;
        final MessageBroker messageBroker = new MessageBroker(brokerMaxStoreBroker);

        final Thread produsingTherad = new Thread(new MessageProducer(messageBroker));
        final Thread consumingTherad = new Thread(new MessageConsumer(messageBroker));

        produsingTherad.start();
        consumingTherad.start();
    }
}
