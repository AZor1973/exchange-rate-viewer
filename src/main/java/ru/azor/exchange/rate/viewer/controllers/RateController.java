package ru.azor.exchange.rate.viewer.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.azor.exchange.rate.viewer.feign.ExchangeRateClient;

@RestController
@RequiredArgsConstructor
public class RateController {
    private final ExchangeRateClient exchangeRateClient;
    @GetMapping
    public ResponseEntity<?> getCurrentRate(){
        return exchangeRateClient.getCurrentRate();
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllRates(){
        return exchangeRateClient.getAllRates();
    }

    @GetMapping("/last")
    public ResponseEntity<?> getLastRate(){
        return exchangeRateClient.getLastRate();
    }
}
