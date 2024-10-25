import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class conversorDeMoedas {

    public Moedas converteMoedas (String moeda) throws IOException, InterruptedException {

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/180498bb807448f9a030f456/latest/" + moeda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Moedas.class);
    }
}
