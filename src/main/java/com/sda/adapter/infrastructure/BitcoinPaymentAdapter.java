package com.sda.adapter.infrastructure;

import com.sda.adapter.domain.Payment;

public class BitcoinPaymentAdapter implements Payment {

    private BitcoinSevice bitcoinSevice;

    private BitcoinServiceFacade bitcoinServiceFacade;

    public BitcoinPaymentAdapter(BitcoinSevice bitcoinSevice) {
        this.bitcoinSevice = bitcoinSevice;
    }

    @Override
    public void pay(int amountInPLN) {

        // to zostalo przezyucone do BITCOIN SERVICE FASADA
//        bitcoinSevice.logInToStock();
//        int moneyInUSD = changeFromPLNtoUSD(amountInPLN);
//
//        bitcoinSevice.transferMoneyToStock(moneyInUSD);
//        bitcoinSevice.buyBotCoins(moneyInUSD);
//        bitcoinSevice.transferTo("Z jednego konta ","na drugie konto", 5);

        bitcoinServiceFacade.reqiestPayment("from","to",5);
    }



    private int changeFromPLNtoUSD (int amountInPLN ){
        return amountInPLN / 3;
    }
}
