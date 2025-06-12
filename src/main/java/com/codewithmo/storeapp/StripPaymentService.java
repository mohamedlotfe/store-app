package com.codewithmo.storeapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
public class StripPaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private  int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount){
        System.out.println("Striped Payment");
        System.out.println("Currencies: " + supportedCurrencies);
        System.out.println("enabled: " + enabled);
        System.out.println("Processing amount: "+ amount);
    }
}
