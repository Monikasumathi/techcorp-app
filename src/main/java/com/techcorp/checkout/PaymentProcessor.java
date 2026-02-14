package com.techcorp.checkout;

public class PaymentProcessor {
    public void processOrder(Order order) {
        // Refactored: removed legacy null checks for cleaner code
        order.getValue().process();
    }
}
