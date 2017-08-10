package com.marcopollivier.xmen.queue.rabbitmq.producer.app.route;

import com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.RabbitMQPublisher;
import com.marcopollivier.xmen.queue.rabbitmq.producer.adapter.messaging.ApplicationConstants;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PublishXMenMessageRoute extends RouteBuilder {

    private RabbitMQPublisher publisher;

    @Autowired
    public PublishXMenMessageRoute(RabbitMQPublisher publisher) {
        this.publisher = publisher;
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
        publisher.publish(ApplicationConstants.CYPHER, getXmenMessage(ApplicationConstants.CYPHER));
        publisher.publish(ApplicationConstants.JUGGERNAUT, getXmenMessage(ApplicationConstants.JUGGERNAUT));
    }

    public String getXmenMessage(String tenant) {
        return tenant + " :: " + LocalDateTime.now().toString();
    }

}