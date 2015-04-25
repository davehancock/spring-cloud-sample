package com.djh.beverage.core.service;

import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.domain.BeverageReceipt;
import com.djh.beverage.core.domain.BeverageType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class CocaColaBeverageService implements BeverageService {

    public static final BigDecimal BEVERAGE_COST = BigDecimal.valueOf(6.00);

    public static final String BEVERAGE_BRAND = "Coca Cola Soft Drink";

    public static final int BEVERAGE_VOLUME = 330;

    private List<Beverage> beverages = new ArrayList<>();

    @Override
    public Beverage dispenseBeverage() {

        Beverage beverage = new Beverage(BeverageType.COCA_COLA, BEVERAGE_BRAND, BEVERAGE_VOLUME, BEVERAGE_COST);
        beverages.add(beverage);
        return beverage;
    }

    @Override
    public Beverage dispenseBeverage(BeverageType beverageType) {
        return dispenseBeverage();
    }

    @Override
    public List<BeverageType> retrieveAvailableBeverageTypes() {

        List<BeverageType> beverageTypes = new ArrayList<>();
        beverageTypes.add(BeverageType.COCA_COLA);
        return beverageTypes;
    }

    @Override
    public BeverageReceipt issueReceipt() {
        return new BeverageReceipt(beverages);
    }
}
