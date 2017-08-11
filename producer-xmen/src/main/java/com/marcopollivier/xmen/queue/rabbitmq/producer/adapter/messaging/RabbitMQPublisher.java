package com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Collections;

@EnableBinding
public class RabbitMQPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private static final String CONTENT_TYPE = "*/*";

    private BinderAwareChannelResolver resolver;

    @Autowired
    public RabbitMQPublisher(BinderAwareChannelResolver resolver) {
        this.resolver = resolver;
    }

    public void publish(String tenant, String xmenMessage) {

        sendMessage(xmenMessage, tenant, CONTENT_TYPE);

        LOGGER.info("XMen message published -> " + xmenMessage);
    }

    private void sendMessage(String body, String tenant, Object contentType) {

        String target = tenant + "-destination";

        MessageHeaders headers = new MessageHeaders(Collections.singletonMap(MessageHeaders.CONTENT_TYPE, contentType));
        resolver.resolveDestination(target).send(MessageBuilder.createMessage(body,headers));
    }

}