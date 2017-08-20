package com.djh.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author David Hancock
 */
@EnableEurekaClient
@SpringBootApplication
public class FoodLoader {

    public static void main(String[] args) {
        SpringApplication.run(FoodLoader.class, args);
    }

}
