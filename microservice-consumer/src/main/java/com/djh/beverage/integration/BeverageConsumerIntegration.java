package com.djh.beverage.integration;

import com.djh.beverage.core.domain.Beverage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.web.client.RestTemplate;


@Configuration
@EnableIntegration
@IntegrationComponentScan("com.djh.beverage.*")
public class BeverageConsumerIntegration {

    /**
     * We need to wire this in to use as a constructor parameter for the MessageHandler
     * or else it will use an instantiated non-ribbon RestTemplate.
     */
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @Description("Outbound channel between BeverageConsumerGateway and HTTPOutboundGateway")
    public MessageChannel requestChannel() {
        return new DirectChannel();
    }

    @Bean
    @Description("Inbound channel between BeverageConsumerGateway and HTTPOutboundGateway")
    public MessageChannel responseChannel() {
        return new DirectChannel();
    }

    @Bean
    @Description("HTTP Outbound Gateway")
    @ServiceActivator(inputChannel = "requestChannel")
    public MessageHandler httpOutboundGateway(MessageChannel responseChannel) {

        HttpRequestExecutingMessageHandler messageHandler = new HttpRequestExecutingMessageHandler("http://microservice/beverage/dispense", restTemplate);
        messageHandler.setExpectedResponseType(Beverage.class);
        messageHandler.setHttpMethod(HttpMethod.GET);
        messageHandler.setOutputChannel(responseChannel);
        return messageHandler;
    }

}
