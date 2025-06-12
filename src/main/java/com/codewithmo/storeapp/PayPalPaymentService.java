package com.codewithmo.storeapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("paypal")
@Primary
public class PayPalPaymentService implements PaymentService {


    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment");
        System.out.println("Payment with amount: " + amount);
    }
}
