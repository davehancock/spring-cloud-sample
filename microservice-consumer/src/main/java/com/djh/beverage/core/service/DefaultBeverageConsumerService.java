package com.djh.beverage.core.service;

import com.djh.beverage.core.domain.Beverage;
import com.djh.beverage.core.service.gateway.BeverageConsumerGateway;
import com.djh.beverage.persistence.BeverageDAO;
import com.djh.beverage.web.BeverageConsumerController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DefaultBeverageConsumerService implements BeverageConsumerService {

    public static final Logger LOG = LoggerFactory.getLogger(BeverageConsumerController.class);

    @Autowired
    private BeverageConsumerGateway beverageConsumerGateway;

    @Autowired
    private BeverageDAO beverageDAO;

    @Override
    public void consumeBeverage() {

        LOG.info("Consuming Beverage!");
        Beverage beverage = beverageConsumerGateway.consumeBeverage("foo");
        LOG.info("Consumed Beverage: " + beverage.toString());

        beverageDAO.saveBeverage(beverage);
    }

    @Override
    public List<Beverage> getConsumedBeverages() {
        return beverageDAO.retrieveConsumedBeverages();
    }

}
