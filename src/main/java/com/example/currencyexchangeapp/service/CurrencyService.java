package com.example.currencyexchangeapp.service;

import com.example.currencyexchangeapp.rest.Currency;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CurrencyService {

    private WebClient webClient;

    public CurrencyService(WebClient.Builder builder){
        webClient = builder.baseUrl("https://api.currencyapi.com").build();
    }

    public Currency getCurrencyExchange(){
        Mono<Currency> currentCurrency = this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/v3/latest").build())
                .header("apiKey", "lGe4FwKsUZGS7V6W80I78OPlXUKji7hpXY9AsMCE")
                .retrieve().bodyToMono(Currency.class);

        return currentCurrency.block();

    }
}
