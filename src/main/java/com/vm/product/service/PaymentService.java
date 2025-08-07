package com.vm.product.service;

import com.vm.product.client.PaymentFeignClient;
import com.vm.product.model.PaymentRequest;
import com.vm.product.model.PaymentResponse;
import com.vm.product.model.RefundRequest;
import com.vm.product.model.RefundResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentService {

    @Autowired
    private PaymentFeignClient paymentFeignClient;

    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        log.info("Processing payment: {}", paymentRequest);
        PaymentResponse response = paymentFeignClient.processPayment(paymentRequest);
        log.info("Payment processed. Status: {}", response.getStatus());
        return response;
    }

    public RefundResponse refundPayment(RefundRequest refundRequest) {
        log.info("Processing refund: {}", refundRequest);
        RefundResponse response = paymentFeignClient.refundPayment(refundRequest);
        log.info("Refund processed. Status: {}", response.getStatus());
        return response;
    }

    public PaymentResponse getPaymentStatus(String transactionId) {
        log.info("Getting payment status for transactionId: {}", transactionId);
        PaymentResponse response = paymentFeignClient.getPaymentStatus(transactionId);
        log.info("Payment status for {}: {}", transactionId, response.getStatus());
        return response;
    }
}

