package com.marcopollivier.xmen.queue.rabbitmq.producer.app.route;

import com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.RabbitMQPublisher;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.ApplicationConstants.COLOSSUS;
import static com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.ApplicationConstants.CYPHER;
import static com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.ApplicationConstants.JUGGERNAUT;

@Component
public class PublishXMenMessageRoute extends RouteBuilder {

    private RabbitMQPublisher staticPublisher;

    @Autowired
    public PublishXMenMessageRoute(RabbitMQPublisher staticPublisher) {
        this.staticPublisher = staticPublisher;
    }

    @Override
    public void configure() throws Exception {

        from("quartz2://queue-multitenancy/jobcron?cron=0/10+*+*+*+*+?")
            .routeId("route-rabbit")
            .end()
            .process(exchange -> {
                stressTest();
            })
            .log("######### Xmen process terminated #########");

    }

    private void stressTest() {
        staticPublisher.publish(CYPHER, getXmenMessage(CYPHER));
        staticPublisher.publish(CYPHER, getXmenMessage(CYPHER));
        staticPublisher.publish(JUGGERNAUT, getXmenMessage(JUGGERNAUT));
        staticPublisher.publish(COLOSSUS, getXmenMessage(COLOSSUS));
    }

    public String getXmenMessage(String tenant) {
        return tenant + " :: " + LocalDateTime.now().toString();
    }

}