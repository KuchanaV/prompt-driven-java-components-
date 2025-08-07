package com.vm.product.service;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private String description;
    private Double amount;
    // ...existing code...
}

