package com.example.springbootrabbitmq.service.work;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ClassName: WorkQueueMessageConsumer
 * Description:
 * date: 2023/3/27/0027 16:53
 *
 * @author myl
 */
@Component
public class WorkQueueMessageConsumer {
    @RabbitListener(queues = RabbitConstant.WORK_QUEUE_NAME)
    public void workQueueListenerFirst(String context){
        System.out.println("workQueueListenerFirst" + context);

    }
    @RabbitListener(queues = RabbitConstant.WORK_QUEUE_NAME)
    public void workQueueListenerSecond(String context){
        System.out.println("workQueueListenerSecond" + context);

    }
}
