package com.github.marcopollivier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.Clock;

@EntityScan(
        basePackageClasses = { QueueApplication.class, Jsr310JpaConverters.class }
)
@SpringBootApplication
@Configuration
public class QueueApplication {

    @Bean
    public Clock clock() {
        return Clock.systemDefaultZone();
    }

    public static void main(String[] args) {
        SpringApplication.run(QueueApplication.class, args);
    }

}