package com.example.SpringCloud.CloudSleuthZipkin;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getPayment(@PathVariable String id) {
        return ResponseEntity.ok("Payment info for Order ID: " + id);
    }
}
