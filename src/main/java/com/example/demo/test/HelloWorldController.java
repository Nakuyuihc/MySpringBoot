package com.example.demo.test;

import com.example.demo.producer.MessageProducer;
import com.example.demo.test.entity.TestEntity;
import com.example.demo.test.mapper.TestMapper;
import com.example.demo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test/")
public class HelloWorldController {

    @Autowired
    private TestService testService;

    @Autowired
    private MessageProducer messageProducer;

    @RequestMapping("/test")
    public String sayHello() {
        return "Hello Wolrd!Hello Wolrd!Hello Wolrd!";
    }

    @RequestMapping("/query/all")
    public List<TestEntity> queryUserAll(){
        return testService.queryAll();
    }

    @RequestMapping(value = "/index")
    public String index(String str) {
        str="消息";
        // 将实体实例写入消息队列
        messageProducer.sendMessage(str);
        return "Success";
    }

}
