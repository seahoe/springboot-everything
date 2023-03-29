package com.example.springbootredisbase;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootRedisBaseApplicationTests {
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        String s = stringRedisTemplate.opsForValue().get("user:user1:name");
        System.out.println(s);
    }

}
