package com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(OutputDestination.class)
public class RabbitMQPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private OutputDestination queueDestination;

    @Autowired
    public RabbitMQPublisher(OutputDestination queueDestination) {
        this.queueDestination = queueDestination;
    }

    public void publish(String tenant, String xmenMessage) {

        MessageBuilder<String> stringMessageBuilder = MessageBuilder.withPayload(xmenMessage);
        stringMessageBuilder.setHeader(ApplicationConstants.TENANT, tenant);

        MessageChannel subscribableChannel = queueDestination.outputXMenMessage();

        subscribableChannel.send(stringMessageBuilder.build());

        LOGGER.info("XMen message published -> " + xmenMessage);
    }

}
