package com.example.pasture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.example.serviceuser.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCaching
public class PastureUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(PastureUserApplication.class, args);
    }

}
