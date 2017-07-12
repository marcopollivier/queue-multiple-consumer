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

    private static final String TENAND = "tenant";

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private OutputDestination queueDestination;

    @Autowired
    public RabbitMQPublisher(OutputDestination queueDestination) {
        this.queueDestination = queueDestination;
    }

    public void publish(String tenant, String mensagem) {
        MessageBuilder<String> stringMessageBuilder = MessageBuilder.withPayload(mensagem);
        stringMessageBuilder.setHeader(TENAND, tenant);


        queueDestination.outputFaturaConvertida().send(stringMessageBuilder.build());

        LOGGER.info("Publicando arquivo de cobranca de " + mensagem);
    }

}
