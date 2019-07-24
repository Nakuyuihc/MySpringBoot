package com.example.demo.consumer;

import com.example.demo.constant.QueueConstants;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = QueueConstants.MESSAGE_QUEUE_NAME)
    public void processMessage(Channel channel, Message message) {
        System.out.println("MessageConsumer收到消息："+new String(message.getBody()));
        try {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {

        }
    }
}
