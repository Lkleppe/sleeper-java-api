package org.sleeper.players;

import com.google.gson.JsonElement;

import java.util.Map;

public class Metadata {

    String channelID;
    String geniusID;
    String rookieYear;

    private Metadata(String channelID, String geniusID, String rookieYear) {
        this.channelID = channelID;
        this.geniusID = geniusID;
        this.rookieYear = rookieYear;
    }

    public String getChannelID() { return channelID; }
    public String getGeniusID() { return geniusID; }
    public String getRookieYear() { return rookieYear; }

    public static Metadata getMetadataFromJson(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();

        JsonElement channelID = jsonMap.get("channel_id");
        JsonElement geniusID = jsonMap.get("genius_id");
        JsonElement rookieYear = jsonMap.get("rookie_year");

        return new Metadata(
                channelID != null && !channelID.isJsonNull() ? channelID.getAsString() : null,
                geniusID != null && !geniusID.isJsonNull() ? geniusID.getAsString() : null,
                rookieYear != null && !rookieYear.isJsonNull() ? rookieYear.getAsString() : null
        );
    }

    public String toString() {
        return String.format("Metadata(channelID=%s, geniusID=%s, rookieYear=%s)", channelID, geniusID, rookieYear);
    }
}
