package org.sleeper.user;

import com.google.gson.*;
import org.sleeper.exceptions.UnknownUserIDException;
import org.sleeper.exceptions.UnknownUsernameException;
import org.sleeper.league.League;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
    private final String avatarID;
    private final String displayName;
    private final Boolean isBot;
    private final String userID;
    private final String username;
    private final Metadata metadata;
    private final Boolean isOwner;

    private User(String avatarID, String displayName, Boolean isBot, String userID, String username, Metadata metadata, Boolean isOwner) {
        this.avatarID = avatarID;
        this.displayName = displayName;
        this.isBot = isBot;
        this.userID = userID;
        this.username = username;
        this.metadata = metadata;
        this.isOwner = isOwner;
    }

    public String toString() {
        return String.format("User(\"%s\", \"%s\")", userID, displayName);
    }

    public static User getUserFromUsername(String username) throws UnknownUsernameException {
        String userJson = UserRESTInteraction.getUserJsonByUsername(username);
        if (userJson == null)
            throw new UnknownUsernameException(username);

        Map<String, JsonElement> jsonMap = JsonParser.parseString(userJson).getAsJsonObject().asMap();

        return new User(
                jsonMap.get("avatar").getAsString(),
                jsonMap.get("display_name").getAsString(),
                Boolean.parseBoolean(jsonMap.get("is_bot").getAsString()),
                jsonMap.get("user_id").getAsString(),
                jsonMap.get("username").getAsString(),
                null,
                null
        );
    }

    public static User getUserFromUserID(String userID) throws UnknownUserIDException {
        String userJson = UserRESTInteraction.getUserJsonByUserID(userID);
        if (userJson == null)
            throw new UnknownUserIDException(userID);

        Map<String, JsonElement> jsonMap = JsonParser.parseString(userJson).getAsJsonObject().asMap();

        return new User(
                jsonMap.get("avatar").getAsString(),
                jsonMap.get("display_name").getAsString(),
                Boolean.parseBoolean(jsonMap.get("is_bot").getAsString()),
                jsonMap.get("user_id").getAsString(),
                jsonMap.get("username").getAsString(),
                null,
                null
        );
    }

    public static User getUserFromJson(JsonElement json) {
        JsonObject asObject = json.getAsJsonObject();

        JsonElement avatar = asObject.get("avatar");
        JsonElement displayName = asObject.get("display_name");
        JsonElement isBot = asObject.get("is_bot");
        JsonElement userID = asObject.get("user_id");
        JsonElement username = asObject.get("username");
        JsonElement metadata = asObject.get("metadata");
        JsonElement isOwner = asObject.get("is_owner");

        return new User (
                avatar != null && !avatar.isJsonNull() ? avatar.getAsString() : null,
                displayName != null && !displayName.isJsonNull() ? displayName.getAsString() : null,
                isBot != null && !isBot.isJsonNull() ? isBot.getAsBoolean() : null,
                userID != null && !userID.isJsonNull() ? userID.getAsString() : null,
                username != null && !username.isJsonNull() ? username.getAsString() : null,
                Metadata.getMetadataFromJson(metadata),
                isOwner != null && !isOwner.isJsonNull() ? isOwner.getAsBoolean() : null
        );
    }

    public String getAvatarID() { return avatarID; }
    public String getDisplayName() { return displayName; }
    public boolean getIsBot() { return isBot; }
    public String getUserID() { return userID; }
    public String getUsername() { return username; }
    public Metadata getMetadata() { return metadata; }
    public Boolean getIsOwner() { return isOwner; }

    public List<League> getUserLeaguesBySeason(String season) {
        List<League> result = new ArrayList<>();
        JsonArray jsonLeagues = JsonParser.parseString(UserRESTInteraction.getUserLeaguesJsonByUserID(userID, season)).getAsJsonArray();
        for (JsonElement json : jsonLeagues)
            result.add(League.getLeague(json.getAsJsonObject().asMap().get("league_id").getAsString()));
        return result;
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(getUserFromUsername("whitekap"));
        System.out.println(User.getUserFromUsername("whitekap").getUserLeaguesBySeason("2025"));
    }
}
