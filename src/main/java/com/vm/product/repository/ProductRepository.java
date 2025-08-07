package com.vm.product.repository;

import com.vm.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // ...existing code...
}

