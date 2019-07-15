package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/test")
    public String sayHello() {
        return "Hello Wolrd!Hello Wolrd!Hello Wolrd!";
    }

}
