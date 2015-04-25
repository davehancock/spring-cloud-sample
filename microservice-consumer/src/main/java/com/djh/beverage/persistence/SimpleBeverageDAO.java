package com.djh.beverage.persistence;

import com.djh.beverage.core.domain.Beverage;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class SimpleBeverageDAO implements BeverageDAO {

    List<Beverage> beverages = new ArrayList<>();

    @Override
    public void saveBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    @Override
    public List<Beverage> retrieveConsumedBeverages() {
        return beverages;
    }

}
