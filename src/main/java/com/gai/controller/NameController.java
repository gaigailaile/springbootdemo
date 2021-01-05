package com.gai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/getname")
    public String getName(){
        int i = 1/0;
        return "gaidongxu";
    }
}
