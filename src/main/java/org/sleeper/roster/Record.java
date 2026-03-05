package org.sleeper.roster;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Record {
    private final int wins;
    private final int ties;
    private final int losses;

    Record(int wins, int ties, int losses) {
        this.wins = wins;
        this.ties = ties;
        this.losses = losses;
    }

    public String toString() {
        return String.format("Record(%dW %dT %dL)", wins, ties, losses);
    }

    public static Record getRecordFromSettingsJson(JsonElement settings) {
        JsonObject asObject = settings.getAsJsonObject();

        return new Record(
                asObject.get("wins").getAsInt(),
                asObject.get("ties").getAsInt(),
                asObject.get("losses").getAsInt()
        );
    }

    public int getWins() { return wins; }
    public int getTies() { return ties; }
    public int getLosses() { return losses; }
}
