package com.djh.beverage.web;

import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.domain.BeverageReceipt;
import com.djh.beverage.core.domain.BeverageType;
import com.djh.beverage.core.service.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/beverage")
public class BeverageController {

    @Autowired
    private BeverageService beverageService;

    @RequestMapping(value = "/dispense", method = RequestMethod.GET)
    public Beverage dispense() {
        return beverageService.dispenseBeverage();
    }

    @RequestMapping(value = "/dispense/{beverageType}", method = RequestMethod.GET)
    public Beverage dispense(@PathVariable String beverageType) {

        String normalisedBvgType = beverageType.toUpperCase();
        BeverageType bvgType = BeverageType.valueOf(normalisedBvgType);

        return beverageService.dispenseBeverage(bvgType);
    }

    @RequestMapping(value = "/types", method = RequestMethod.GET)
    public List<String> getBeverageTypes() {

        List<BeverageType> beverageTypes = beverageService.retrieveAvailableBeverageTypes();

        List<String> bvgTypes = new ArrayList<>();
        for (BeverageType bvgType : beverageTypes) {
            String beverageType = bvgType.name();
            bvgTypes.add(beverageType);
        }

        return bvgTypes;
    }

    @RequestMapping(value = "/receipt", method = RequestMethod.GET)
    public BeverageReceipt receipt() {
        return beverageService.issueReceipt();
    }

}
