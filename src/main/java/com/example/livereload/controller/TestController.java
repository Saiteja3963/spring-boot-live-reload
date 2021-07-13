package com.example.livereload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestClass testClass;

    @Value("${test.message}")
    private String message;

    @GetMapping("/test")
    public String test(){
        System.out.println(testClass.getDetails().get("hari").getAge());
        return "Message is "+ message;
    }
}
