package com.djh.beverage.core.service.gateway;

import com.djh.beverage.core.domain.Beverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public class SimpleBeverageConsumerGateway implements BeverageConsumerGateway {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Beverage consumeBeverage(String foo) {
        Beverage beverage = restTemplate.getForObject("http://microservice/beverage/dispense", Beverage.class);
        return beverage;
    }

}
