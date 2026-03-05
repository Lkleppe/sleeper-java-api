package org.sleeper.roster;

import com.google.gson.JsonElement;

import java.util.Map;

public class Metadata {
    String record;
    String streak;

    private Metadata(String record, String streak) {
        this.record = record;
        this.streak = streak;
    }

    public static Metadata getMetadataFromJson(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();
        return new Metadata(
                jsonMap.get("record").getAsString(),
                jsonMap.get("streak").getAsString()
        );
    }
}
