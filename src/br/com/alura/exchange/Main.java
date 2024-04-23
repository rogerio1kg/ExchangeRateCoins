package br.com.alura.exchange;

import br.com.alura.exchange.converter.ConverterExchangeCoins;
import br.com.alura.exchange.menu.MenuInter;
import br.com.alura.exchange.menu.MenuInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        try {
            while (option != 7) {
                ConverterExchangeCoins converter = new ConverterExchangeCoins();
                MenuInterface show = new MenuInterface();
                MenuInter inter = new MenuInter();
                show.showInterface();

                option = scanner.nextInt();

                double value = 0;

                if (option == 1) {
                    System.out.println(inter.converterConclusion("USD", "BRL", "Dólar", "Real Brasileiro"));
                } else if (option == 2) {
                    System.out.println(inter.converterConclusion("BRL", "USD", "Real Brasileiro", "Dólar"));
                } else if (option == 3) {
                    System.out.println(inter.converterConclusion("JPY", "BRL", "Iene", "Real Brasileiro"));
                } else if (option == 4) {
                    System.out.println(inter.converterConclusion("BRL", "JPY", "Real Brasileiro", "Iene"));
                } else if (option == 5) {
                    System.out.println(inter.converterConclusion("CHF", "BRL", "Franco Suíço", "Real Brasileiro"));
                } else if (option == 6) {
                    System.out.println(inter.converterConclusion("BRL", "CHF", "Real Brasileiro", "Franco Suíço"));
                } else if (option == 7) {
                    System.out.println("Saindo da aplicação... Volte sempre!");
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Escolha inválida....");
            System.out.println("Finalizando a aplicação....");
        }
    }
}