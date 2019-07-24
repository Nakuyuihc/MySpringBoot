package com.example.demo.producer;

import com.example.demo.constant.QueueConstants;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(String str) {

        rabbitTemplate.convertAndSend(QueueConstants.MESSAGE_EXCHANGE, QueueConstants.MESSAGE_ROUTE_KEY, str);
    }

}
