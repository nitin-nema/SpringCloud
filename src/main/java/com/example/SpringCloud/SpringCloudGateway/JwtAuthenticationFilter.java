package com.example.SpringCloud.SpringCloudGateway;

import org.springframework.security.oauth2.jwt.JwtException;

@Component
public class JwtAuthenticationFilter extends AbstractGatewayFilterFactory<JwtAuthenticationFilter.Config> {

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            String token = exchange.getRequest().getHeaders().getFirst("Authorization");
            if (isValidToken(token)) {
                return chain.filter(exchange);
            }
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        };
    }

    private boolean isValidToken(String token) {
        // Implement JWT validation logic here
        //decoding token
        //verfying the signature
        //checking the claims(expiration time, issuer etc)


        try{
            String secretKey ="your_sectretKey";
            Claims claims = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token.replace("Bearer ", ""))
                    .getBody();
              return !claims.getExpiration().before(new Date());
        }catch(JwtException | IllegalArgumentException e){
            return false;
        }
    }

    public static class Config {
        // Configuration properties for the filter can go here
    }
}
