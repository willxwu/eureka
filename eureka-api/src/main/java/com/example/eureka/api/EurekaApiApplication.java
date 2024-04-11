package com.example.eureka.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class EurekaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApiApplication.class, args);
    }

}
