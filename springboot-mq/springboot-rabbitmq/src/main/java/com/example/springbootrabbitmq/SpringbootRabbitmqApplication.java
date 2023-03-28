package com.example.springbootrabbitmq;

import com.example.springbootrabbitmq.constant.RabbitConstant;
import jakarta.annotation.Resource;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRabbitmqApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRabbitmqApplication.class, args);

    }

}
