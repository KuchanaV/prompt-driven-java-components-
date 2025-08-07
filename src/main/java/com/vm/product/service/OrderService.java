package com.vm.product.service;

import com.vm.product.common.GenericResponse;
import com.vm.product.common.Pagination;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public GenericResponse.SuccessResponse<Order> getOrderById(String orderId) {
        // ...existing code...
        Order order = restTemplate.getForObject("http://order-service/api/orders/" + orderId, Order.class);
        return GenericResponse.SuccessResponse.<Order>builder()
                .data(order)
                .timestamp(Instant.now())
                .requestId(UUID.randomUUID().toString())
                .message("Order fetched successfully")
                .build();
    }

    public GenericResponse.SuccessResponse<List<Order>> getOrders(int page, int size) {
        // ...existing code...
        List<Order> orders = restTemplate.getForObject("http://order-service/api/orders?page=" + page + "&size=" + size, List.class);
        Pagination pagination = Pagination.builder()
                .page(page)
                .size(size)
                .totalElements(100) // Example, replace with actual value
                .totalPages(10)     // Example, replace with actual value
                .build();
        return GenericResponse.SuccessResponse.<List<Order>>builder()
                .data(orders)
                .timestamp(Instant.now())
                .requestId(UUID.randomUUID().toString())
                .pagination(pagination)
                .message("Orders fetched successfully")
                .build();
    }

    public GenericResponse.ErrorResponse handleOrderError(String errorCode, String errorMessage) {
        // ...existing code...
        return GenericResponse.ErrorResponse.builder()
                .timestamp(Instant.now())
                .requestId(UUID.randomUUID().toString())
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .build();
    }
}

