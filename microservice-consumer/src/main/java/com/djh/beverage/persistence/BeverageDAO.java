package com.djh.beverage.persistence;

import com.djh.beverage.core.domain.Beverage;

import java.util.List;


public interface BeverageDAO {

    void saveBeverage(Beverage beverage);

    List<Beverage> retrieveConsumedBeverages();

}
