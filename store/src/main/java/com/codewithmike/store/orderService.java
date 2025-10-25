package com.codewithmike.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    private PaymentService paymentService;

// This constructor will not be used by Spring.
//    public orderService(PaymentService paymentService, int x){}

//    Constructor Injection
    @Autowired
    public orderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        //var paymentService = new stripePaymentService();
        paymentService.processPayment(100.0);
        //System.out.println("Order has been placed successfully.");
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
