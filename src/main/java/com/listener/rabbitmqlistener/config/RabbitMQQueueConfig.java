package com.listener.rabbitmqlistener.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfig {

    @Bean
    Queue exampleQueue() {
        return new Queue("Example Queue", false);
    }

    @Bean
    Queue SecondExampleQueue() {
        return QueueBuilder
                .durable("Second Example Queue")
                .autoDelete()
                .exclusive()
                .build();
    }
}
