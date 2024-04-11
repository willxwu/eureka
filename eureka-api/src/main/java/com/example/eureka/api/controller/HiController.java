package com.example.eureka.api.controller;

import entity.User;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class HiController {

    @GetMapping("/hi")
    public User hi(){
        log.info("当前时间：{}",System.currentTimeMillis());
        User user = new User("张三",18);
        return user;
    }
}
