package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * Created by marcoollivier on 06/06/17.
 */
public interface InputDestination {

    @Input(QueueConstants.FATURA_CONVERTIDA_INPUT)
    MessageChannel inputFaturaConvertida();

}
