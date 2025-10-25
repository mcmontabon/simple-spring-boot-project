package com.codewithmike.store;

public class stripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE PAYMENT SERVICE");
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
