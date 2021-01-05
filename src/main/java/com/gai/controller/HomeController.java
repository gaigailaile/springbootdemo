package com.gai.controller;

import com.gai.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/add")
    public void add(String name,String adress){
        homeService.add(name, adress);
    }
}
