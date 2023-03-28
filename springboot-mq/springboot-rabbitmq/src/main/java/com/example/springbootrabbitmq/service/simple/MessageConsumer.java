package com.example.springbootrabbitmq.service.simple;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName: messageConsumer
 * Description:
 * date: 2023/3/27/0027 15:26
 *
 * @author myl
 */
@Component
@RabbitListener(queues = "hello")
public class MessageConsumer {
    @RabbitHandler
    public void receive(String message){
        System.out.println("receive"+message);
    }

}
