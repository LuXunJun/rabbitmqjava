package com.lxj.rabbitmqproducer;

import com.lxj.rabbitmqproducer.config.RabbitmqConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqProducerApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void contextLoads() {
        String message = "send info to user222";
//        发送测试消息到队列
        rabbitTemplate.convertAndSend(
                RabbitmqConfig.EXCHANGE_TOPICS_INFORM,RabbitmqConfig.ROUTINGKEY_EMAIL,message);
    }

}
