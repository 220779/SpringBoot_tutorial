package com.dailycodebuffer.SpringBootdependency.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String helloWorld (){
        return "Welcome to Daily Code Buffer !!";
    }
}
