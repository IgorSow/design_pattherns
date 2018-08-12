package com.sda.adapter.infrastructure;

import com.sda.adapter.domain.Payment;

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
