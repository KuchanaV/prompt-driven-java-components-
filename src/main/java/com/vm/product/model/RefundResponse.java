package com.vm.product.model;

import lombok.Data;

@Data
public class RefundResponse {
    private String refundId;
    private String status;
    private String message;
    private Double refundAmount;
}
