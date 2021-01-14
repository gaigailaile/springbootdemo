//package com.gai.controller;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
//    public Map<String,Object> exceptionHandler(){
//        Map<String,Object> result = new HashMap<>();
//        result.put("code","1");
//        result.put("msg","系统出错");
//        return result;
//    }
//}
