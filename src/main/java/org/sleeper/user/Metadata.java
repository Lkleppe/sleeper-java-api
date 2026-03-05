package org.sleeper.user;

import com.google.gson.JsonElement;

public class Metadata {
    private final String teamName;

    Metadata(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() { return teamName; }

    static Metadata getMetadataFromJson(JsonElement json) {
        JsonElement teamName = json.getAsJsonObject().get("team_name");

        return new Metadata (
                teamName != null && !teamName.isJsonNull() ? teamName.getAsString() : null
        );
    }
}
