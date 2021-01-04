package com.gai.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class HelloController {
    @GetMapping("/hello")
    public String helle(){
        return "hello world";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class,args);
//    }
}
