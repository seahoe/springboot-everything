package com.example.springbootrabbitmq;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import com.example.springbootrabbitmq.service.fanout.FanoutMessageProducer;
import com.example.springbootrabbitmq.service.simple.MessageProducer;
import com.example.springbootrabbitmq.service.work.WorkQueueMessageProducer;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootRabbitmqApplicationTests {
    @Resource
    MessageProducer messageProducer;
    @Resource
    WorkQueueMessageProducer workQueueMessageProducer;
    @Resource
    FanoutMessageProducer fanoutMessageProducer;
    @Resource
    RabbitTemplate rabbitTemplate;

    @Test
    //测试简单模式
    void contextLoads() {
        messageProducer.sendMessage("123343432343");
    }

    //测试工作队列模式
    @Test
    void testWorkQueue(){
        workQueueMessageProducer.sendMessage("这里是来自工作队列生产者发的消息");
    }

    //测试发布订阅模式
    @Test
    void testFanout(){
        fanoutMessageProducer.sendMessage("我广播了一条信息！！！！");
    }
    @Test
    void testByMyself(){
        rabbitTemplate.convertAndSend(RabbitConstant.HEADER_EXCHANGE_NAME,"","这把消息橙橙的了！！！");
    }
}
