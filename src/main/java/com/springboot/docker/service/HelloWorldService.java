package com.springboot.docker.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello World";
    }
}

