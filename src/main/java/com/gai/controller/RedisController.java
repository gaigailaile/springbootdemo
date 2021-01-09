package com.gai.controller;

import com.gai.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/getString")
    public String getString(String key){
        return (String) redisUtils.getString(key);
    }

    @GetMapping("/getStr")
    public String getStr(String key){
        return redisUtils.getStr(key);
    }
}
