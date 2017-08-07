package com.github.marcopollivier.adapter.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

import static com.github.marcopollivier.adapter.messaging.QueueConstants.FATURA_CONVERTIDA_CYPHER_INPUT;
import static com.github.marcopollivier.adapter.messaging.QueueConstants.FATURA_CONVERTIDA_JUGGERNAUT_INPUT;

/**
 * Created by marcoollivier on 06/06/17.
 */
public interface InputDestination {

    @Input(FATURA_CONVERTIDA_JUGGERNAUT_INPUT)
    MessageChannel inputFaturaConvertidaJuggernaut();

    @Input(FATURA_CONVERTIDA_CYPHER_INPUT)
    MessageChannel inputFaturaConvertidaCypher();
}
