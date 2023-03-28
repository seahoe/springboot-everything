package com.example.springbootrabbitmq.config;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: RabbitWorkConfig
 * Description:
 * date: 2023/3/27/0027 16:48
 *
 * @author myl
 */

@Configuration
public class RabbitWorkConfig {
    @Bean
    public Queue workQueue(){
        return new Queue(RabbitConstant.WORK_QUEUE_NAME);
    }


}
