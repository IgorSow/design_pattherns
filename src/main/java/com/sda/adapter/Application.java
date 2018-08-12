package com.sda.adapter;

import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        BitcoinPaymentAdapter bitcoinPaymentAdapter = new BitcoinPaymentAdapter(new BitcoinSevice());

        PayPalPaymentAdapter payPalPaymentAdapter = new PayPalPaymentAdapter(new PaypalService());

        List<Payment> payments = Arrays.asList(bitcoinPaymentAdapter, payPalPaymentAdapter);

        PaymentService paymentService = new PaymentService(payments);

        paymentService.requestPayment(10);
        System.out.println();
        paymentService.requestPayment(50);
        System.out.println();
        paymentService.requestPayment(100);


    }
}

