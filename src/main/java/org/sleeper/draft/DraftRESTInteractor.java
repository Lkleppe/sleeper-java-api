package org.sleeper.draft;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DraftRESTInteractor {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String leagueID = "1255633238693523456";

    public static String getAllDrafts() {
        return getHTTPResponse(allDraftsURI());
    }

    private static String allDraftsURI() {
        return "https://api.sleeper.app/v1/league/" + leagueID + "/drafts";
    }

    private static String getHTTPResponse(String url) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(getAllDrafts());
    }
}
