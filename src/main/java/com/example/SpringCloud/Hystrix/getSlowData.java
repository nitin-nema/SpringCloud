package com.example.SpringCloud.Hystrix;

@HystrixCommand(fallbackMethod = "fallbackMethod", commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
})
public String getSlowData() {
    // Simulated slow service call
    return restTemplate.getForObject("http://slow-service/data", String.class);
}
