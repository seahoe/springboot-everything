package com.example.springbootrabbitmq.service.fanout;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import jakarta.annotation.Resource;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * ClassName: FanoutMessageProducer
 * Description:
 * date: 2023/3/27/0027 19:32
 *
 * @author myl
 */
@Component
public class FanoutMessageProducer {
    @Resource
    RabbitTemplate rabbitTemplate;
    public  void  sendMessage(String context){
        rabbitTemplate.convertAndSend(RabbitConstant.HEADER_EXCHANGE_NAME,"",context);
    }
}
