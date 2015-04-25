# Microservice POC

[![Build Status](https://travis-ci.org/daves125125/MicroservicePOC.svg)](https://travis-ci.org/daves125125/MicroservicePOC)

This example uses the following technologies:

- Spring Boot
- Spring Cloud Config
- Spring Cloud Netflix
    - Netflix Eureka
    - Netflix Ribbon


The following modules exist and must be started in the below order:

- service-registry (Spring Booted Eureka Server)
- configuration-server (Spring Config Server, Eureka Client)
- microserviceA (Spring Config Client, Eureka Client)
- microserviceB (Eureka Client)
- microservice-consumer (Euerka Client, Ribbon RestTemplate implementation)

