package com.gai.activemq.p2p;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.transaction.Transactional;

@Component
public class Producer {

    private static Logger logger = Logger.getLogger(Producer.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Transactional
    public void send(String msg) {
        jmsMessagingTemplate.convertAndSend(queue, msg);
    }
}
