package com.gai.controller;

import com.gai.activemq.p2p.Producer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activemq")
public class ActiveMqController {
    private static Logger logger = Logger.getLogger(ActiveMqController.class);

    @Autowired
    private Producer producer;

    @GetMapping("/send")
    public void send(String msg){
        producer.send(msg);
    }
}
