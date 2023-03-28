package com.example.springbootfanoutrabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFanoutrabbitApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootFanoutrabbitApplication.class, args);

        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
