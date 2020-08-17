package one.innovation.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientHttpExemplo {

    public static void main(String[] args) throws IOException, InterruptedException {
        connectAndPrintUrlContent();
    }

    private static void connectAndPrintUrlContent() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://openjdk.java.net/"))
                .build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());

        response.headers().map().forEach((k,v) -> System.out.println(k+":"+v));

        System.out.println(response.body());
    }
}
