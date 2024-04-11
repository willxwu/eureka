package com.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://EUREKAAPI/api/hi", String.class);
        return forEntity.getBody();
    }
}
