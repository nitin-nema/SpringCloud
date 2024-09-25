package com.example.SpringCloud.SpringCloudGateway;

@Component
public class CustomHeaderFilter implements GatewayFilterFactory<CustomHeaderFilter.Config> {

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            exchange.getRequest()
                    .mutate()
                    .header("X-Custom-Header", "CustomHeaderValue");
            return chain.filter(exchange);
        };
    }

    public static class Config {
        // Configuration properties for the filter can go here
    }
}
