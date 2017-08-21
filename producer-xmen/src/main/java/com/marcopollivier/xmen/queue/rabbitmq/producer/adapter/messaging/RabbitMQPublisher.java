package com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.binding.BinderAwareChannelResolver;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Collections;

import static com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.ApplicationConstants.COLOSSUS;

@EnableBinding
public class RabbitMQPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQPublisher.class);

    private static final String CONTENT_TYPE = "*/*";

    private BinderAwareChannelResolver resolver;

    private String channelName;

    @Autowired
    public RabbitMQPublisher(BinderAwareChannelResolver resolver) {
        this.resolver = resolver;
    }

    public void publish(String tenant, String xmenMessage) {

        sendMessage(xmenMessage, tenant, CONTENT_TYPE);

        LOGGER.info("XMen message published -> " + xmenMessage);
    }

    private void sendMessage(String body, String tenant, Object contentType) {

        String target = "XMenQueueOutput";

        if(!tenant.equals(COLOSSUS)) {
            target = "magneto.faturaProcessadas." + tenant;
        }

        /*
         * TODO opções:
         *   pegar informção do banco de dados ou do yml.
         *   Nos dois casos, se não estiver configurado que será utilizado um gerenciador de arquivos específico
         *   será utilizado o colossus. Acredito que, por ser uma escolha de qual gerenciador está sendo utilizado,
         *   essa configuração pode ficar dentro do yml
         */

        MessageHeaders headers = new MessageHeaders(Collections.singletonMap(MessageHeaders.CONTENT_TYPE, contentType));
        resolver.resolveDestination(target).send(MessageBuilder.createMessage(body,headers));
    }

}