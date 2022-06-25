package ru.azor.exchange.rate.viewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExchangeRateViewerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeRateViewerApplication.class, args);
    }

}
