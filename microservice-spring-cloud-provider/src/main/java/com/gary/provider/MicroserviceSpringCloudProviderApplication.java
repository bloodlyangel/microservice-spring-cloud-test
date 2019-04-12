package com.gary.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceSpringCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSpringCloudProviderApplication.class, args);
    }

}
