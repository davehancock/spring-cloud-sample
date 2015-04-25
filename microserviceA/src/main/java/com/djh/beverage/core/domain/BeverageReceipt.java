package com.djh.beverage.core.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author David Hancock
 */
public class BeverageReceipt {

    private List<Beverage> beverages = new ArrayList<>();

    private BigDecimal cost;

    private Date date;

    public BeverageReceipt(List<Beverage> beverages) {
        this.beverages = beverages;
        this.cost = calculateCost(beverages);
        this.date = new Date();
    }

    private BigDecimal calculateCost(List<Beverage> beverages){

        BigDecimal cost = BigDecimal.ZERO;

        for (Beverage beverage: beverages){
            cost = cost.add(beverage.getCost());
        }

        return cost;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public Date getDate() {
        return date;
    }
}
