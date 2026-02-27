package org.sleeper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sleeper {
    private String leagueID;
    private HttpClient client;

    public Sleeper(String leagueID) {
        this.leagueID = leagueID;
        client = HttpClient.newHttpClient();
    }

    public Sleeper() {
        client = HttpClient.newHttpClient();
    }

    public static Sleeper Builder() {
        return new Sleeper();
    }

    public String getLeague() throws Exception {
        return getHTTPResponse(getLeagueURI());
    }

    public String getLeagueUsers() throws Exception {
        return getHTTPResponse(getLeagueUsersURI());
    }

    public String getLeagueRosters() throws Exception {
        return getHTTPResponse(getLeagueRostersURI());
    }

    public String getLeagueWinnersBracket() throws Exception {
        return getHTTPResponse(getLeagueWinnersBracketURI());
    }

    public String getPlayers() throws Exception {
        return getHTTPResponse(getPlayersURI());
    }

    private String getHTTPResponse(String url) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private String getLeagueURI() { return "https://api.sleeper.app/v1/league/" + leagueID; }
    private String getLeagueUsersURI() { return getLeagueURI() + "/users"; }
    private String getLeagueRostersURI() {
        return getLeagueURI() + "/rosters";
    }
    private String getLeagueWinnersBracketURI() {
        return getLeagueURI() + "/winners_bracket";
    }
    private String getPlayersURI() { return "https://api.sleeper.app/v1/players/nfl"; }

    public static void main(String[] args) throws Exception {
        Sleeper sleeper = new Sleeper();
        Files.writeString(Path.of("players.json"), sleeper.getPlayers());
    }
}

