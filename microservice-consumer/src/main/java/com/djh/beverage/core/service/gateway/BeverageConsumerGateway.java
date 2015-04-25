package com.djh.beverage.core.service.gateway;

import com.djh.beverage.core.domain.Beverage;
import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway(defaultRequestChannel = "requestChannel", defaultReplyChannel = "responseChannel")
public interface BeverageConsumerGateway {

    // Awkward workaround for no pollable channel error, we need a parameter here.
    Beverage consumeBeverage(String foo);
}
