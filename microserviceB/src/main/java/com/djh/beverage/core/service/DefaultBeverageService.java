package com.djh.beverage.core.service;

import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.domain.BeverageReceipt;
import com.djh.beverage.core.domain.BeverageType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class DefaultBeverageService implements BeverageService {

    public static final BigDecimal BEVERAGE_COST = BigDecimal.valueOf(12.49);

    public static final String BEVERAGE_BRAND = "Moa Original";

    public static final int BEVERAGE_VOLUME = 473;

    private List<Beverage> beverages = new ArrayList<>();

    @Override
    public Beverage dispenseBeverage() {
        return dispenseBeverage(BeverageType.BEER);
    }

    @Override
    public Beverage dispenseBeverage(BeverageType beverageType) {

        Beverage beverage = new Beverage(beverageType, BEVERAGE_BRAND, BEVERAGE_VOLUME, BEVERAGE_COST);
        beverages.add(beverage);
        return beverage;
    }

    public List<BeverageType> retrieveAvailableBeverageTypes() {

        List<BeverageType> beverageTypes = new ArrayList<>();
        beverageTypes.add(BeverageType.BEER);
        beverageTypes.add(BeverageType.LEMONADE);

        return beverageTypes;
    }

    @Override
    public BeverageReceipt issueReceipt() {
        return new BeverageReceipt(beverages);
    }

}
