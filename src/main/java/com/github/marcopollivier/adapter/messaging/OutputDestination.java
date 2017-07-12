package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by marcoollivier on 05/06/17.
 */
public interface OutputDestination {

    @Output(QueueConstants.FATURA_CONVERTIDA_OUTPUT)
    SubscribableChannel outputFaturaConvertida();

}
