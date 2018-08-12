package com.sda.adapter.infrastructure;

public class BitcoinServiceFacade {

    public BitcoinSevice bitcoinSevice;

    public void reqiestPayment(String from, String to, int amount){
        bitcoinSevice.logInToStock();
        bitcoinSevice.buyBotCoins(amount);
        bitcoinSevice.transferTo("from","to",5);
    }


}
