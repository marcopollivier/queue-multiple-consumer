package com.github.marcopollivier.app.route;

import com.github.marcopollivier.adapter.messaging.ApplicationConstants;
import com.github.marcopollivier.adapter.messaging.RabbitMQPublisher;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static com.github.marcopollivier.adapter.messaging.ApplicationConstants.CYPHER;
import static com.github.marcopollivier.adapter.messaging.ApplicationConstants.JUGGERNAUT;

/**
 * Created by marcoollivier on 22/05/17.
 */
@Component
public class ArquivoCobrancaRoute extends RouteBuilder {

    private RabbitMQPublisher publisher;

    @Autowired
    public ArquivoCobrancaRoute(RabbitMQPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void configure() throws Exception {

        from("quartz2://queue-multitenancy/jobcron?cron=0/1+*+*+*+*+?")
            .routeId("route-rabbit")
            .end()
            .process(exchange -> {
                stressTest();
            })
            .log("Processo finalizado");

    }

    private void stressTest() {
        publisher.publish(CYPHER, getMensagem(CYPHER));
        publisher.publish(JUGGERNAUT, getMensagem(JUGGERNAUT));
        publisher.publish(JUGGERNAUT, getMensagem(JUGGERNAUT));
        publisher.publish(CYPHER, getMensagem(CYPHER));
        publisher.publish(JUGGERNAUT, getMensagem(JUGGERNAUT));
        publisher.publish(JUGGERNAUT, getMensagem(JUGGERNAUT));
        publisher.publish(CYPHER, getMensagem(CYPHER));
        publisher.publish(JUGGERNAUT, getMensagem(JUGGERNAUT));
        publisher.publish(CYPHER, getMensagem(CYPHER));
        publisher.publish(CYPHER, getMensagem(CYPHER));
    }

    public String getMensagem(String tenant) {
        return tenant + " :: " + LocalDateTime.now().toString();
    }

}