package com.example.SpringCloud.CloudSleuthZipkin;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public ResponseEntity<String> getOrder(@PathVariable String id) {
        String paymentInfo = restTemplate.getForObject("http://payment-service/payments/" + id, String.class);
        return ResponseEntity.ok("Order ID: " + id + ", Payment Info: " + paymentInfo);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
