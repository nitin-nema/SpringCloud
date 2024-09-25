package com.example.SpringCloud.EurekaClient;

@Bean
@LoadBalanced
public RestTemplate restTemplate() {
    return new RestTemplate();
}

//https://my-microservice/service