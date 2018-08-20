package com.springboot.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import java.util.List;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
        List<String> beanNames = Arrays.asList(ctx.getBeanDefinitionNames());
        beanNames.forEach((name)->System.out.println(" - " + name));
    }

}
