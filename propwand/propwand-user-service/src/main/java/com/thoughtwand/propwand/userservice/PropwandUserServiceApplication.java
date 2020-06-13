package com.thoughtwand.propwand.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PropwandUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropwandUserServiceApplication.class, args);
    }

}
