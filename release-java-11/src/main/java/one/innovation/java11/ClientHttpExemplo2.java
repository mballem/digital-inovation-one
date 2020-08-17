package one.innovation.java11;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ClientHttpExemplo2 {

    public static void main(String[] args) {

        //connectAkamaiHttpClient("HTTP/1.1", HttpClient.Version.HTTP_1_1);

        connectAkamaiHttpClient("HTTP/2", HttpClient.Version.HTTP_2);
    }

    static ExecutorService executorService = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            System.out.println("Nova Thread :: " + (thread.isDaemon() ? "daemon" : "") + " Thread Group :: " + thread.getThreadGroup());
            return thread;
        }
    });

    private static void connectAkamaiHttpClient(String httpType, HttpClient.Version httpVersion) {
        System.out.println("Running " + httpType + " exemplo...");
        try {
            HttpClient client = HttpClient.newBuilder()
                    .version(httpVersion)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());

            response.headers().map().forEach((k, v) -> System.out.println(k + ":" + v));

            String body = response.body();
            System.out.println(body);

            List<Future<?>> futures = new ArrayList<>();
            body.lines()
                 .filter(line -> line.trim().startsWith("<img height"))
                 .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                 .forEach(image -> {
                     Future<?> imgFuture = executorService.submit(() -> {
                         HttpRequest imgRequest = HttpRequest.newBuilder()
                                 .uri(URI.create("https://http2.akamai.com" + image))
                                 .build();
                         try {
                             HttpResponse<String> imgResponse = client.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                             System.out.println("imagem carregada :: " + image + ", status code :: "+ imgResponse.statusCode());
                         } catch (IOException | InterruptedException e) {
                             e.printStackTrace();
                         }
                     });
                     futures.add(imgFuture);
                     System.out.println("Submetido um future para a imagem :: " + image);
                 });

            futures.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total :: " + (end - start) + "ms");

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
