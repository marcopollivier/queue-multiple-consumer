package com.github.marcopollivier.app.route;

import com.github.marcopollivier.adapter.messaging.RabbitMQPublisher;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static com.github.marcopollivier.adapter.messaging.ApplicationConstants.CYPHER;
import static com.github.marcopollivier.adapter.messaging.ApplicationConstants.JUGGERNAUT;

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
        publisher.publish(CYPHER, getXmenMessage(CYPHER));
        publisher.publish(JUGGERNAUT, getXmenMessage(JUGGERNAUT));
    }

    public String getXmenMessage(String tenant) {
        return tenant + " :: " + LocalDateTime.now().toString();
    }

}