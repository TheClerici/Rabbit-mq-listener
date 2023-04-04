package com.listener.rabbitmqlistener.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {

    @Bean
    Exchange exampleExchange() {
        return new TopicExchange("ExampleExchange");
    }

    @Bean
    Exchange secondExampleExchange() {
        return ExchangeBuilder
                .directExchange("DirectExampleExchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange thirdExampleExchange() {
        return ExchangeBuilder
                .topicExchange("TopicExampleExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }

    @Bean
    Exchange fourthExampleExchange() {
        return ExchangeBuilder
                .fanoutExchange("FanoutExampleExchange")
                .autoDelete()
                .durable(false)
                .internal()
                .build();
    }

    @Bean
    Exchange fifthExampleExchange() {
        return ExchangeBuilder
                .headersExchange("HeadersExampleExchange")
                .autoDelete()
                .durable(true)
                .ignoreDeclarationExceptions()
                .build();
    }
}
