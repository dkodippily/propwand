package com.thoughtwand.propwand.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableDiscoveryClient
public class PropwandAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropwandAuthServiceApplication.class, args);
    }

}
