package com.djh.beverage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ConsumerLoader {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerLoader.class, args);
    }

}
