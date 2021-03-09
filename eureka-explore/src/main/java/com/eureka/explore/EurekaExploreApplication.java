package com.eureka.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yht
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaExploreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaExploreApplication.class, args);
    }

}
