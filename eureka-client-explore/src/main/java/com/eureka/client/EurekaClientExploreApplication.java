package com.eureka.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientExploreApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientExploreApplication.class, args);
    }
}
