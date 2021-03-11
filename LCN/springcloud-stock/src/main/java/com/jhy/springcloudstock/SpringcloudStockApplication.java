package com.jhy.springcloudstock;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
@MapperScan("com.jhy.springcloudstock.dao")
public class SpringcloudStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStockApplication.class, args);
    }

}
