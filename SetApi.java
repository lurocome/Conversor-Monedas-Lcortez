import com.google.gson.Gson;
import com.google.gson.JsonArray;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class SetApi {

public Conversion buscarMoneda(String buscarPais){
    String direccion = "https://v6.exchangerate-api.com/v6/193b1f8828b8c177d311bd30/latest/" +
            buscarPais;

    try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        String json = response.body();
       // for (int i=1;i <=5;i++){};
        //System.out.println(json);
        return new Gson().fromJson(json, Conversion.class);

    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (Exception e) {
        System.out.println("Ocurrio error inesperado");
        System.out.println(e.getMessage());
    }
    return null;
}
}

