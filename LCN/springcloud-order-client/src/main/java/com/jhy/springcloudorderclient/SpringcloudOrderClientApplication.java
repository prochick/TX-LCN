package com.jhy.springcloudorderclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.jhy.springcloudorderclient.service")
public class SpringcloudOrderClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrderClientApplication.class, args);
    }

}
