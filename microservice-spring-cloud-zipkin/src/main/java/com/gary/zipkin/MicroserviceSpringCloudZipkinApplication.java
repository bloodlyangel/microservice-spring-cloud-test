package com.gary.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class MicroserviceSpringCloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringCloudZipkinApplication.class, args);
    }

}
