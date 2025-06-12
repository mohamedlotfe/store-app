package com.codewithmo.storeapp;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {


    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment");
        System.out.println("Payment with amount: " + amount);
    }
}
