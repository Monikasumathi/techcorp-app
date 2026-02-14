package com.techcorp.checkout;

public class PaymentProcessor {
    public void processOrder(Order order) {
        // Null safety check
        if (order != null && order.getValue() != null) {
            order.getValue().process();
        }
    }
}
