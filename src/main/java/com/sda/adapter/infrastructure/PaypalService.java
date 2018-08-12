package com.sda.adapter.infrastructure;

public class PaypalService {

    public void longInToPayPal() {
        System.out.println("logging to PayPal");
    }

    public void depositToPayPalAccount(int amount) {
        System.out.println("deposit some money");
    }

    public void requstPayment(String from, String to, int amount) {
        System.out.println("Requesting payment");
    }


}
