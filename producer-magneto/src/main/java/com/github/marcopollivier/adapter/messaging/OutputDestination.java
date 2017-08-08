package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

import static com.github.marcopollivier.adapter.messaging.QueueConstants.FATURA_CONVERTIDA_OUTPUT;

/**
 * Created by marcoollivier on 05/06/17.
 */
public interface OutputDestination {

    @Output(FATURA_CONVERTIDA_OUTPUT)
    MessageChannel outputFaturaConvertida();

}
