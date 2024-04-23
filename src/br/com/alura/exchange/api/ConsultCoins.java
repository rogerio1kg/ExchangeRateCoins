package br.com.alura.exchange.api;

import br.com.alura.exchange.converter.Coin;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultCoins {
    private static final String apiKey = "84c45697ba6f7abc104145d3";
    public Coin searchCoin(String coinBase, String coinConverter, double resultConverter) {

        URI endpoint = URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey + "/pair/" + coinBase + "/" + coinConverter + "/" + resultConverter);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endpoint)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Coin.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível identificar dados sobre está moeda.");
        }
        }

}

