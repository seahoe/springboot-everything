package com.example.springbootrabbitmq.service.fanout;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName: FanoutMessageConsumer
 * Description:
 * date: 2023/3/27/0027 19:35
 *
 * @author myl
 */
@Component
public class FanoutMessageConsumer {
    @RabbitListener(queues = {RabbitConstant.HEADER_FIRST_QUEUE_NAME})
    public void consumeMessage(String context){
        System.out.println("消费者1" + context);
    }
}
