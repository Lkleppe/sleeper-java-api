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

    public Metadata getMetadataFromJson(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();
        return new Metadata(
                jsonMap.get("channel_id").getAsString(),
                jsonMap.get("genius_id").getAsString(),
                jsonMap.get("rookie_year").getAsString()
        );
    }
}
