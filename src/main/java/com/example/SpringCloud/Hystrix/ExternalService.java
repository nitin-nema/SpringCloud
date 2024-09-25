package com.example.SpringCloud.Hystrix;

@Service
public class ExternalService {

    @HystrixCommand(fallbackMethod = "fallbackForGetData")
    public String getDataFromExternalService() {
        // Simulate external service call
        return restTemplate.getForObject("http://external-service/data", String.class);
    }

    // Fallback method invoked if the main method fails
    public String fallbackForGetData() {
        return "Fallback response: External service is down.";
    }
}

// http:localhost:8080/hystrix

// http:localhost:8080/hystrix.stream