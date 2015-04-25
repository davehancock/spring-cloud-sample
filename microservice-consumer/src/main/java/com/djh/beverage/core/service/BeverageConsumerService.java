package com.djh.beverage.core.service;

import com.djh.beverage.core.domain.Beverage;

import java.util.List;


public interface BeverageConsumerService {

    void consumeBeverage();

    List<Beverage> getConsumedBeverages();

}
