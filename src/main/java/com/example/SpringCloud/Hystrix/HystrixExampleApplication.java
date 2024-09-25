package com.example.SpringCloud.Hystrix;

@SpringBootApplication
@EnableHystrixDashboard  // advance dashboard thing to discuss in session
@EnableCircuitBreaker
public class HystrixExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixExampleApplication.class, args);
    }
}
