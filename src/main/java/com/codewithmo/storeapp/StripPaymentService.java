package com.codewithmo.storeapp;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount){
        System.out.println("Processing Striped Payment");
        System.out.println("Processing Payment"+ amount);
    }
}
