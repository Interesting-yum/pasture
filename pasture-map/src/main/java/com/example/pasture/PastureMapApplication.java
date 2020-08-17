package com.example.pasture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@MapperScan("com.example.pasture.mapper")
@SpringCloudApplication
@EnableEurekaClient
@EnableHystrix
@EnableZuulProxy
@EnableCaching
@RibbonClient(value = "pasture-map")
public class PastureMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(PastureMapApplication.class, args);
    }

}
