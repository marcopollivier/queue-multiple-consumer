package com.github.marcopollivier.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.MessageBuilder;

import static com.github.marcopollivier.adapter.messaging.ApplicationConstants.TENANT;

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

    public void publish(String tenant, String mensagem) {


        MessageBuilder<String> stringMessageBuilder = MessageBuilder.withPayload(mensagem);
        stringMessageBuilder.setHeader(TENANT, tenant);

        MessageChannel channel = queueDestination.outputFaturaConvertida();

        channel.send(stringMessageBuilder.build());


        LOGGER.info("Publicando arquivo de cobranca de " + mensagem);
    }

}
