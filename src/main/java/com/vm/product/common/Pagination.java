package com.vm.product.common;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pagination {
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
}
