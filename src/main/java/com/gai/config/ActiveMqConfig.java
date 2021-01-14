package com.gai.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class ActiveMqConfig {
    @Bean
    public Queue logQueue(){
        return new ActiveMQQueue("springboot-queue");
    }
}
