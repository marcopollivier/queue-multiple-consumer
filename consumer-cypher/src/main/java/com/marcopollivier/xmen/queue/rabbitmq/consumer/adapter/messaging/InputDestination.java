package com.marcopollivier.xmen.queue.rabbitmq.consumer.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

import static com.marcopollivier.xmen.queue.rabbitmq.consumer.adapter.messaging.QueueConstants.CYPHER_QUEUE_INPUT;

public interface InputDestination {

    @Input(CYPHER_QUEUE_INPUT)
    MessageChannel outputCypherMessage();

}
