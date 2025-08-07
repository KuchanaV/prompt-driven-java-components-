package com.vm.product.model;

import lombok.Data;

@Data
public class RefundRequest {
    private String transactionId;
    private Double refundAmount;
    // ...add other fields as needed...
}

