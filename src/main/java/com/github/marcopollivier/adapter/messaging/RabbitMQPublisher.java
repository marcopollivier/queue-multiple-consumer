package com.github.marcopollivier.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by marcoollivier on 25/05/17.
 */
@EnableBinding(OutputDestination.class)
public class RabbitMQPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private OutputDestination queueDestination;

    @Autowired
    public RabbitMQPublisher(OutputDestination queueDestination) {
        this.queueDestination = queueDestination;
    }

    public void publish(String mensagem) {
        queueDestination.outputFaturaConvertida().send(MessageBuilder.withPayload(mensagem).build());
        LOGGER.info("Publicando arquivo de cobranca de " + mensagem);
    }

}
