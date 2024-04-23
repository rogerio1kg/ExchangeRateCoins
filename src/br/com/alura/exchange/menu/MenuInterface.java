package br.com.alura.exchange.menu;

public class MenuInterface {
    public void showInterface() {
        System.out.println("***********************************************************************************************");
        System.out.println("Bem vindo(a) ao aplicativo de conversão de moedas!");
        System.out.println(
                "1) Dólar para Real Brasileiro" +
                        "\n2) Real Brasileiro para Dólar" +
                        "\n3) Iene Japonês para Real Brasileiro" +
                        "\n4) Real Brasileiro para Iene Japonês" +
                        "\n5) Franco Suíço para Real Brasileiro" +
                        "\n6) Real Brasileiro para Franco Suíço" +
                        "\n7) Sair" +
                        "\nEscolha uma opção válida:"
        );
        System.out.println("***********************************************************************************************");
    }
}
