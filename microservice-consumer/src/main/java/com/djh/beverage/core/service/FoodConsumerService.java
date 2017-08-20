package com.djh.beverage.core.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author David Hancock
 */
@Service
public class FoodConsumerService {

    private RestTemplate restTemplate;

    public FoodConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String consumeFood() {
        return restTemplate.getForObject("http://microZ/food/dispense", String.class);
    }

}
