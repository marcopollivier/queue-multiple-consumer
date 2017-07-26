package com.github.marcopollivier.app.route;

import com.github.marcopollivier.adapter.messaging.RabbitMQPublisher;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

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
                publisher.publish("cypher", "cypher :: " + getMensagem());
                publisher.publish("juggernaut", "juggernaut :: " + getMensagem());
            })
            .log("Processo finalizado");

    }

    public String getMensagem() {
        return LocalDateTime.now().toString();
    }

}