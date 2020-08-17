package com.example.pasture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.example.pasture.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableCaching
public class PastureMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(PastureMainApplication.class, args);
    }

}
