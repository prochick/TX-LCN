package com.jhy.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.jhy.springcloudclient.service")
public class SpringcloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClientApplication.class, args);
    }

}
