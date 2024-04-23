package br.com.alura.exchange.converter;

import br.com.alura.exchange.api.ConsultCoins;

public class ConverterExchangeCoins {
    private double baseToConverter;
    private String coinBase;
    private String coinConverter;
    private String coinBaseExtense;
    private String coinBaseExchange;

    public String converter(double btc, String cb, String cc, String cbe, String cbex){
        this.baseToConverter = btc;
        this.coinBase = cb;
        this.coinConverter = cc;
        this.coinBaseExtense = cbe;
        this.coinBaseExchange = cbex;


        ConsultCoins converter = new ConsultCoins();
        Coin newCoin = converter.searchCoin(coinBase, coinConverter, baseToConverter);
        double valueConverter = newCoin.conversion_rate() * this.baseToConverter;

        return this.baseToConverter + " " + cb +" (" + cbe + ") equivalem a "+ valueConverter + " " + coinConverter + " (" + coinBaseExchange + ").";
    }
}
