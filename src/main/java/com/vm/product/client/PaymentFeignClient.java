package com.vm.product.client;

import com.vm.product.model.PaymentRequest;
import com.vm.product.model.PaymentResponse;
import com.vm.product.model.RefundRequest;
import com.vm.product.model.RefundResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(
    name = "payment-service",
    url = "${payment.service.url}",
    configuration = com.vm.product.config.FeignConfig.class
)
public interface PaymentFeignClient {

    @PostMapping("/payments/process")
    PaymentResponse processPayment(@RequestBody PaymentRequest paymentRequest);

    @PostMapping("/payments/refund")
    RefundResponse refundPayment(@RequestBody RefundRequest refundRequest);

    @GetMapping("/payments/status/{transactionId}")
    PaymentResponse getPaymentStatus(@PathVariable("transactionId") String transactionId);
}

