package com.marcopollivier.xmen.queue.rabbitmq.consumer.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

import static com.marcopollivier.xmen.queue.rabbitmq.consumer.adapter.messaging.QueueConstants.XMEN_CONSUMER_QUEUE_INPUT;

public interface InputDestination {

    @Input(XMEN_CONSUMER_QUEUE_INPUT)
    MessageChannel outputCypherMessage();

}
