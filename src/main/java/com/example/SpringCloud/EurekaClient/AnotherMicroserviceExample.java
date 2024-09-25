package com.example.SpringCloud.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Autowired
private RestTemplate restTemplate;

public String AnotherMicroserviceExample {
    String serviceUrl = "http://my-microservice/api/data";

    return resrtTemplate.getForObject(serviceUrl, String.class);
}
