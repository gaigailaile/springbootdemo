package com.gai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
//@EnableAutoConfiguration
public class HelloController {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return port + " say hello world";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class,args);
//    }
}
