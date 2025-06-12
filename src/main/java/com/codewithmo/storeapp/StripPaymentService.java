package com.codewithmo.storeapp;

public class StripPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount){
        System.out.println("Processing Striped Payment");
        System.out.println("Processing Payment"+ amount);
    }
}
