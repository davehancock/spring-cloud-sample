package com.djh.food.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Hancock
 */
@RestController
@RequestMapping("/food")
public class FoodController {

    @GetMapping("/dispense")
    public String consume() {
        return "Something tasty";
    }

}
