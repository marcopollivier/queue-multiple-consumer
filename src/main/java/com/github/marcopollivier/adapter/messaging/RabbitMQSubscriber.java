package com.github.marcopollivier.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Created by marcoollivier on 06/06/17.
 */
@EnableBinding(InputDestination.class)
public class RabbitMQSubscriber {

    private static final Logger LOG = LoggerFactory.getLogger(RabbitMQSubscriber.class);

    @Autowired
    public RabbitMQSubscriber() {

    }

    @StreamListener(QueueConstants.FATURA_CONVERTIDA_INPUT)
    public void processaJuggernaut(String dado) throws Throwable {
        LOG.info("PROCESSADO JUGGERNAUT ::: " + dado);
    }


    @StreamListener(QueueConstants.FATURA_CONVERTIDA_INPUT)
    public void processaCypher(String dado) throws Throwable {
        LOG.info("PROCESSADO CYPHER ::: " + dado);
    }

}