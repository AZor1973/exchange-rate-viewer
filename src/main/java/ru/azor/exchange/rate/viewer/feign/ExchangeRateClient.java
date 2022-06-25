package ru.azor.exchange.rate.viewer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "exchangeRateClient", url = "http://localhost:5000/rate")
public interface ExchangeRateClient {
    @GetMapping
    ResponseEntity<?> getCurrentRate();

    @GetMapping("/all")
    ResponseEntity<?> getAllRates();

    @GetMapping("/last")
    ResponseEntity<?> getLastRate();
}
