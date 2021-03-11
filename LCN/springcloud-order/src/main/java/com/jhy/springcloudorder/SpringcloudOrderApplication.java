package com.jhy.springcloudorder;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
@MapperScan("com.jhy.springcloudorder.dao")
@EnableFeignClients(basePackages = "com.jhy.springcloudorder.service")
public class SpringcloudOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrderApplication.class, args);
    }

}
