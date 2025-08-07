package com.vm.product.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public Request.Options options() {
        return new Request.Options(120_000, 120_000); // 2 minutes connect & read timeout
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1000, 2000, 3); // initial interval, max interval, max attempts
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

