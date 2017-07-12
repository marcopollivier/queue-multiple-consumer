package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * Created by marcoollivier on 06/06/17.
 */
public interface InputDestination {

    @Input(QueueConstants.FATURA_CONVERTIDA_JUGGERNAUT_INPUT)
    MessageChannel inputFaturaConvertidaJuggernaut();

    @Input(QueueConstants.FATURA_CONVERTIDA_CYPHER_INPUT)
    MessageChannel inputFaturaConvertidaCypher();
}
