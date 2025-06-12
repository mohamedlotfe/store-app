package com.codewithmo.storeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    public  OrderService(){ }

    @Autowired
    public OrderService(PaymentService paymentService) {
       this.paymentService = paymentService;
  }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        this.paymentService.processPayment(10);
    }
}
