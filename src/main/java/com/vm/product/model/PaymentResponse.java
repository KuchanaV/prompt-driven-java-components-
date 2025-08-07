package com.vm.product.model;

import lombok.Data;

@Data
public class PaymentResponse {
    private String transactionId;
    private String status;
    private String message;
    private Double amount;
}
