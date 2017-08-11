package com.marcopollivier.xmen.queue.rabbitmq.consumer.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.core.env.Environment;

@EnableBinding(InputDestination.class)
public class RabbitMQSubscriber {

    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQSubscriber.class);

    private Environment environment;

    @Autowired
    public RabbitMQSubscriber(Environment environment) {
        this.environment = environment;
    }

    @StreamListener(QueueConstants.XMEN_CONSUMER_QUEUE_INPUT)
    public void processaCypher(String cypherMessage) {

        String[] activeProfiles = environment.getActiveProfiles();
        String activeProfile = activeProfiles[0];

        LOG.info(activeProfile + " -> " + cypherMessage);

    }

}