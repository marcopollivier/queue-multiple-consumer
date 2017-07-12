package com.github.marcopollivier.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import static com.github.marcopollivier.adapter.messaging.QueueConstants.FATURA_CONVERTIDA_CYPHER_INPUT;
import static com.github.marcopollivier.adapter.messaging.QueueConstants.FATURA_CONVERTIDA_JUGGERNAUT_INPUT;

/**
 * Created by marcoollivier on 06/06/17.
 */
@EnableBinding(InputDestination.class)
public class RabbitMQSubscriber {

    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQSubscriber.class);

    @Autowired
    public RabbitMQSubscriber() {
    }

    @StreamListener(FATURA_CONVERTIDA_JUGGERNAUT_INPUT)
    public void processaJuggernaut(String dado) {
        LOG.info("PROCESSADO JUGGERNAUT ::: " + dado);
    }


    @StreamListener(FATURA_CONVERTIDA_CYPHER_INPUT)
    public void processaCypher(String dado) {
        LOG.info("PROCESSADO CYPHER ::: " + dado);
    }

}