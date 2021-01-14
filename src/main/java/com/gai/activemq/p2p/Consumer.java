package com.gai.activemq.p2p;

import org.apache.log4j.Logger;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private static Logger logger = Logger.getLogger(Consumer.class);

    @JmsListener(destination = "springboot-queue")
    public void receive(String msg) {
        logger.info("监听器收到msg:" + msg);
    }
}
