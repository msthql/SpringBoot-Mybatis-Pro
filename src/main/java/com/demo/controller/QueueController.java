package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessageOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jms.Queue;


@RestController
public class QueueController {


    @Autowired
    private JmsMessageOperations jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @RequestMapping("/send")
    public void send(){
        //指定消息发送的目的地及内容
        this.jmsMessagingTemplate.convertAndSend(this.queue,"新发送的消息！");
    }
}
