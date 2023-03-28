package com.example.springbootrabbitmq.service.fanout;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName: FanoutMessageConsumerSecond
 * Description:
 * date: 2023/3/27/0027 19:36
 *
 * @author myl
 */
@Component
public class FanoutMessageConsumerSecond {
    @RabbitListener(queues = {RabbitConstant.HEADER_SECOND_QUEUE_NAME})
    public void consumeMessage(String context){
        System.out.println("消费者2" + context);
    }
}
