package com.codewithmo.storeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;


   // @Autowired
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
       this.paymentService = paymentService;
  }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        this.paymentService.processPayment(10);
    }
}
