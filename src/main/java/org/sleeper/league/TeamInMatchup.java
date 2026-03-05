package org.sleeper.league;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.sleeper.players.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamInMatchup {
    Double points;
    List<Player> players;
    String rosterID;
    Double customPoints;
    List<Player> starters;
    List<Double> startersPoints;
    Map<String, Double> playersPoints;

    public TeamInMatchup(Double points, List<Player> players, String rosterID, Double customPoints,
                         List<Player> starters, List<Double> startersPoints, Map<String, Double> playersPoints) {
        this.points = points;
        this.players = players;
        this.rosterID = rosterID;
        this.customPoints = customPoints;
        this.starters = starters;
        this.startersPoints = startersPoints;
        this.playersPoints = playersPoints;
    }

    public Double getPoints() { return points; }
    public List<Player> getPlayers() { return players; }
    public String getRosterID() { return rosterID; }
    public Double getCustomPoints() { return customPoints; }
    public List<Player> getStarters() { return starters; }
    public List<Double> getStartersPoints() { return startersPoints; }
    public Map<String, Double> getPlayersPoints() { return playersPoints; }

    public static TeamInMatchup getTeamFromJson(JsonElement json) {
        JsonObject asObject = json.getAsJsonObject();

        JsonElement points = asObject.get("points");
        JsonElement players = asObject.get("players");
        JsonElement rosterID = asObject.get("roster_id");
        JsonElement customPoints = asObject.get("custom_points");
        JsonElement starters = asObject.get("starters");
        JsonElement startersPoints = asObject.get("starters_points");
        JsonElement playersPoints = asObject.get("players_points");

        List<Player> playerList = new ArrayList<>();
        List<Player> starterList = new ArrayList<>();
        List<Double> startersPointsList = new ArrayList<>();
        Map<String, Double> playerPointsMap = new HashMap<>();

        if (!players.isJsonNull())
            for (JsonElement e : players.getAsJsonArray())
                playerList.add(Player.getPlayerByID(e.getAsString()));

        if (!starters.isJsonNull())
            for (JsonElement e : starters.getAsJsonArray())
                playerList.add(Player.getPlayerByID(e.getAsString()));

        if (!startersPoints.isJsonNull())
            for (JsonElement e : startersPoints.getAsJsonArray())
                startersPointsList.add(e.getAsDouble());

        if (!playersPoints.isJsonNull())
            for (String id : playersPoints.getAsJsonObject().keySet())
                playerPointsMap.put(id, playersPoints.getAsJsonObject().get(id).getAsDouble());

        return new TeamInMatchup (
                points != null && !points.isJsonNull() ? points.getAsDouble() : null,
                playerList,
                rosterID != null && !rosterID.isJsonNull() ? rosterID.getAsString() : null,
                customPoints != null && !customPoints.isJsonNull() ? customPoints.getAsDouble() : null,
                starterList,
                startersPointsList,
                playerPointsMap
        );
    }

    public String toString() {
        return String.format("TeamInMatchup{%s, %s, %s, %s, %s, %s, %s}", points, players, rosterID,
                customPoints, starters, startersPoints, playersPoints);
    }
}
