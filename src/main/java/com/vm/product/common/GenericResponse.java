package com.vm.product.common;

import lombok.*;
import java.time.Instant;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse<T> {
    private T data;
    private Instant timestamp;
    private String requestId;
    private Pagination pagination;

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SuccessResponse<T> {
        private T data;
        private Instant timestamp;
        private String requestId;
        private Pagination pagination;
        private String message;
    }

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ErrorResponse {
        private Instant timestamp;
        private String requestId;
        private Pagination pagination;
        private String errorCode;
        private String errorMessage;
    }
}
