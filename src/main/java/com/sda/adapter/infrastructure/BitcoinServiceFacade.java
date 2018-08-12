package com.sda.adapter.infrastructure;

public class BitcoinServiceFacade {

    public BitcoinSevice bitcoinSevice;

    public void reqiestPayment(String from, String to, int amount){
        bitcoinSevice.logInToStock();
        bitcoinSevice.buyBotCoins(amount);
        bitcoinSevice.transferTo("from","to",5);
    }

    //adapter jest czewscia adaptera, pozostaje tylko bardziej rozbudowany- w adapterze logika pozostaje prosta
    // ma laczyc tylko systemy

    //adapter ma tylko laczyc najwaznijesza czynnosc
    //fasada ma dodatkowa logike - ma rozne
}
