package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutputDestination {

    @Output(QueueConstants.XMEN_QUEUE_OUTPUT)
    MessageChannel outputXMenMessage();

}
