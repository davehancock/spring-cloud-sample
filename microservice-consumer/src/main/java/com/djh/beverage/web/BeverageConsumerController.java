package com.djh.beverage.web;

import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.service.BeverageConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/beverage")
public class BeverageConsumerController {


    @Autowired
    private BeverageConsumerService beverageConsumerService;

    @RequestMapping(value = "/consume", method = RequestMethod.GET)
    public void consumeBeverage() {

        beverageConsumerService.consumeBeverage();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Beverage> getConsumedBeverages() {

        List<Beverage> beverages = beverageConsumerService.getConsumedBeverages();
        return beverages;
    }

}
