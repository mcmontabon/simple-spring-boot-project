package com.codewithmike.store;

import org.springframework.stereotype.Service;

@Service
public class paypalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL PAYMENT SERVICE");
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
