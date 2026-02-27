package org.sleeper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpInteraction {
    private static final HttpClient client = HttpClient.newHttpClient();

    public static String getHttpResponse(String url) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            Main.logger.severe("Exception occurred in HttpInteraction.getHttpResponse(): " + e);
            return "";
        }
    }
}
