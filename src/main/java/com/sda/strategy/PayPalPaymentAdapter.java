package com.sda.strategy;

import com.sda.adapter.domain.Payment;
import com.sda.adapter.infrastructure.PaypalService;

public class PayPalPaymentAdapter implements Payment {

    private PaypalService paypalService;

    public PayPalPaymentAdapter(PaypalService paypalService) {
        this.paypalService = paypalService;
    }

    @Override
    public void pay(int amountInPLN) {

        paypalService.longInToPayPal();

        paypalService.depositToPayPalAccount(amountInPLN);
        paypalService.requstPayment("","",5);
    }



}
