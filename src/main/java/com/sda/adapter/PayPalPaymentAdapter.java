package com.sda.adapter;

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
