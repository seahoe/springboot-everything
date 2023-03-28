package com.example.springbootrabbitmq.service.simple;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Date;

/**
 * ClassName: MessageProducer
 * Description:
 * date: 2023/3/27/0027 15:11
 *
 * @author myl
 */
@Component
@Slf4j
public class MessageProducer {
    @Resource
    private AmqpTemplate rabbitTemplate;

    public void sendMessage(String message) {
        String date = "===========sender===========" + new Date();
        log.info("sender"+date);
        rabbitTemplate.convertAndSend("hello", message);
    }
}

