package com.example.springbootrabbitmq.config;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.RandomAccess;

/**
 * ClassName: RabbitFanoutConfig
 * Description:
 * date: 2023/3/27/0027 19:13
 *
 * @author myl
 */
@Configuration
public class RabbitFanoutConfig {
    /**
     * 发布/订阅模式，需要定义交换机exchange和Queue，并对两者进行绑定
     * 两者是多对多的关系
     * 进入Exchange的消息，如果没有绑定的queue，则消息被丢弃
     * 这里我们定义一个交换机对应两个队列
     */
    @Bean
    public FanoutExchange fanoutExchange(){
        return (FanoutExchange)ExchangeBuilder.fanoutExchange(RabbitConstant.HEADER_EXCHANGE_NAME)
                .durable(true).build();
    }

    @Bean
    public Queue fanoutQueueFirst(){
        return QueueBuilder.durable(RabbitConstant.HEADER_FIRST_QUEUE_NAME).build();
    }

    @Bean
    public Queue fanoutQueueSecond(){
        return QueueBuilder.durable(RabbitConstant.HEADER_SECOND_QUEUE_NAME).build();
    }
    //将exchange和queue绑定

    /**
     * 可以复用一个方法来绑定多个队列到同一个交换机，但是在这种情况下，如果需要对不同的队列设置不同的参数，就需要拆分成不同的方法。
     * 例如，如果`fanoutQueue1`和`fanoutQueue2`需要使用不同的路由键或参数进行绑定，则需要分别使用不同的方法来绑定它们。这可以确保不同的队列能够以最佳的方式进行绑定。
     * 此外，将这些方法拆分为单独的Bean也有助于提高代码的可读性和可维护性。每个方法都负责创建一组绑定，使得代码结构更清晰，并且方便日后维护和修改。
     * @return
     */
    @Bean
    public Binding fanoutBindingFirst(Queue fanoutQueueFirst, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutQueueFirst).to(fanoutExchange);
    }

    @Bean
    public Binding fanoutBindingSecond(Queue fanoutQueueSecond, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutQueueSecond).to(fanoutExchange);
    }


}
