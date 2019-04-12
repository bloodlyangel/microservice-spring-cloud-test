package com.gary.cloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudtestApplication.class, args);
    }

}
