package org.sleeper.league;

import com.google.gson.JsonElement;

import java.util.Map;

public class Metadata {
    private boolean autoContinue;
    private int keeperDeadline;
    private int latestWinnerRosterID;

    public Metadata(boolean autoContinue, int keeperDeadline, int latestWinnerRosterID) {
        this.autoContinue = autoContinue;
        this.keeperDeadline = keeperDeadline;
        this.latestWinnerRosterID = latestWinnerRosterID;
    }

    public static Metadata getMetadata(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();
        return new Metadata(
                jsonMap.get("auto_continue").getAsString().equalsIgnoreCase("on"),
                jsonMap.get("keeper_deadline").getAsInt(),
                jsonMap.get("latest_league_winner_roster_id").getAsInt()
        );
    }
}
