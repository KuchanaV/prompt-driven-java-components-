package com.vm.product.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private String orderId;
    private Double amount;
    private String paymentMethod;
    // ...add other fields as needed...
}

