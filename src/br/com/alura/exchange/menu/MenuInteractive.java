package br.com.alura.exchange.menu;

import br.com.alura.exchange.controller.ExchangeValue;

import java.util.Scanner;

public class MenuInteractive {

    private double value = 0;

    Scanner scanner = new Scanner(System.in);

    private final ExchangeValue conver = new ExchangeValue();

    public String converterConclusion(String cb, String cc, String cbe, String cbex) {
        System.out.println("Informe o valor em " + cbe + " que deseja converter para " + cbex + "?");
        value = scanner.nextDouble();
        return "\n" + conver.converter(value, cb, cc, cbe, cbex) + "\n";
    }
}
