package com.alura.conversordivisas.conexiones;

import com.alura.conversordivisas.modelos.DivisasAPI;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    public DivisasAPI divisaBusqueda(String divisaOrigen, String divisaPorConvertir){

        

        //**************Puedes colocar tu propia clave de la API en caso de que la proporcionada haya caducado**************
        String apiKey = "f38ac95ecf15caa7e11ebed0";

        URI uriDeApi = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"+ divisaOrigen +"/"+ divisaPorConvertir +"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uriDeApi)
                .build();

        try {

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            return new Gson().fromJson(json, DivisasAPI.class);

        } catch (Exception e) {

            throw new RuntimeException("La divisa no fue encontrada.");

        }

    }

}
