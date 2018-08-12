package com.sda.strategy;

import com.sda.adapter.domain.Payment;

import java.util.List;

public class PaymentStrategy {

    public Payment selectBestPayment(PaymentModel paymentModel, List<Payment> paymentList) {

        if ("BTC".equalsIgnoreCase(paymentModel.getPreferredMode())) {
            return paymentList.get(0);
        } else if ("PLN".equalsIgnoreCase(paymentModel.getPreferredMode())) {
            return paymentList.get(1);
        }
        if (paymentModel.getTo().length() > 20) {
            return paymentList.get(1);
        }
        return paymentList.get(0);
    }



}
