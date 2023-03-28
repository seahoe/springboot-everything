package com.example.springbootfanoutrabbit.service.fanout;

import com.example.springbootfanoutrabbit.constant.RabbitConstant;
import com.example.springbootfanoutrabbit.service.MessageConSumer;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName: FanoutMessageConsumer
 * Description:
 * date: 2023/3/28/0028 9:14
 *
 * @author myl
 */
@Component
@RabbitListener(queues = RabbitConstant.HEADER_FIRST_QUEUE_NAME)
public class FanoutMessageConsumer implements MessageConSumer {
    @Override
    @RabbitHandler
    public void recive(String message) {
        System.out.println(message);
    }
}
