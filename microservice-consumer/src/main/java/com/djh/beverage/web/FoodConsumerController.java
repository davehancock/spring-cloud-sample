package com.djh.beverage.web;

import com.djh.beverage.core.service.FoodConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Hancock
 */
@RestController
@RequestMapping("/food")
public class FoodConsumerController {

    private FoodConsumerService foodConsumerService;

    public FoodConsumerController(FoodConsumerService foodConsumerService) {
        this.foodConsumerService = foodConsumerService;
    }

    @GetMapping("/consume")
    public String consumeBeverage() {
        return foodConsumerService.consumeFood();
    }

}
