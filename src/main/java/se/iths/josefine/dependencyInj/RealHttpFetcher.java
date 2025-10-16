package se.iths.josefine.dependencyInj;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RealHttpFetcher implements HttpFetcher {
    public String fetchPostById(int postId) throws IOException, InterruptedException {

        System.out.println("Hämtar data: " + postId + "...");

        HttpClient client = HttpClient.newHttpClient();
        String url = "https://jsonplaceholder.typeicode.com/posts/" + postId;

        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Data hämtad..." + response.statusCode());
        return response.body();
    }
}
