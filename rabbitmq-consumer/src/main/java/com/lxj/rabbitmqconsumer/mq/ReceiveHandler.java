package com.lxj.rabbitmqconsumer.mq;

import com.lxj.rabbitmqconsumer.config.RabbitmqConfigConsumer;
import com.rabbitmq.client.AMQP;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveHandler {

    @RabbitListener(queues = "#{queueEmail.name}")
    public void receive_handler(String msg, Channel channel){
        System.out.println("消息队列获取到的:"+msg +" 通道:" + channel );
    }
}
