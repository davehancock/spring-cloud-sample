package com.djh.beverage.core.service;

import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.domain.BeverageReceipt;
import com.djh.beverage.core.domain.BeverageType;

import java.util.List;

/**
 * @author David Hancock
 */
public interface BeverageService {

    Beverage dispenseBeverage();

    Beverage dispenseBeverage(BeverageType beverageType);

    List<BeverageType> retrieveAvailableBeverageTypes();

    BeverageReceipt issueReceipt();

}
