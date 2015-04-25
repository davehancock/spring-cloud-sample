package com.djh.beverage.core.domain;

import java.math.BigDecimal;

/**
 * @author David Hancock
 */
public class Beverage {

    private BeverageType beverageType;

    private String beverageDescription;

    private int volume;

    private BigDecimal cost;

    public Beverage(BeverageType beverageType, String beverageDescription, int volume, BigDecimal cost) {
        this.beverageType = beverageType;
        this.beverageDescription = beverageDescription;
        this.volume = volume;
        this.cost = cost;
    }

    public BeverageType getBeverageType() {
        return beverageType;
    }

    public String getBeverageDescription() {
        return beverageDescription;
    }

    public int getVolume() {
        return volume;
    }

    public BigDecimal getCost() {
        return cost;
    }
}
