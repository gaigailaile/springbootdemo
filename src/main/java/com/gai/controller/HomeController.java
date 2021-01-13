package com.gai.controller;

import com.gai.service.db1.HomeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static Logger logger = Logger.getLogger(HomeController.class);

    @Autowired
    private HomeService homeService;

    @Autowired
    private com.gai.service.db2.HomeService homeService2;

    @GetMapping("/add")
    public void add(String name,String address){
        homeService.add(name, address);
        logger.info("log4j输出添加成功!");
    }

    @GetMapping("/findByName")
    public String findByName(String name){
        return homeService.findByName(name).toString();
    }

    @GetMapping("/findByName2")
    public String findByName2(String name){
        return homeService2.findByName(name).toString();
    }

    @GetMapping("/addError")
    @Transactional
    public void addError(){
        homeService.add("db1","db1 address");
        int i = 1/0;
        homeService2.add("db2","db2 address");
    }

    @GetMapping("/addError2")
    @Transactional
    public void addError2(){
        homeService2.add("db2","db2 address");
        int i = 1/0;
        homeService.add("db1","db1 address");
    }

}
