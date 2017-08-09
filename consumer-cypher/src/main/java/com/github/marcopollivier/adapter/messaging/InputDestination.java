package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

import static com.github.marcopollivier.adapter.messaging.QueueConstants.CYPHER_QUEUE_INPUT;

public interface InputDestination {

    @Input(CYPHER_QUEUE_INPUT)
    MessageChannel outputCypherMessage();

}
