package com.gai.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void setString(String key,String value){
        setString(key, value, null);
    }

    public void setString(String key,String value,Long time){
        redisTemplate.opsForValue().set(key,value);
        if(time != null)
            redisTemplate.expire(key,time, TimeUnit.SECONDS);
    }

    public Object getString(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public String getStr(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

    public boolean delString(String key){
        return redisTemplate.delete(key);
    }
}
