package com.marcopollivier.xmen.queue.rabbitmq.consumer.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(InputDestination.class)
public class RabbitMQSubscriber {

    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQSubscriber.class);

    @Autowired
    public RabbitMQSubscriber() {
    }

    @StreamListener(QueueConstants.CYPHER_QUEUE_INPUT)
    public void processaCypher(String cypherMessage) {

        if(cypherMessage.contains("juggernaut")) {
            LOG.error("!!!! ERROR !!!!!!!");
            return;
        }

        LOG.info("CYPHER -> " + cypherMessage);
    }

}