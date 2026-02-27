package org.sleeper.user;

import com.google.gson.*;
import java.util.Map;

public class User {
    private String avatarID;
    private String displayName;
    private boolean isBot;
    private String userID;
    private String username;

    private User(String avatarID, String displayName, boolean isBot, String userID, String username) {
        this.avatarID = avatarID;
        this.displayName = displayName;
        this.isBot = isBot;
        this.userID = userID;
        this.username = username;
    }

    public String toString() {
        return String.format("User(\"%s\", \"%s\")", avatarID, username);
    }

    public static User getUserFromUsername(String username) {
        String userJson = UserRESTInteraction.getUserJsonByUsername(username);
        Map<String, JsonElement> jsonMap = JsonParser.parseString(userJson).getAsJsonObject().asMap();

        return new User(
                jsonMap.get("avatar").getAsString(),
                jsonMap.get("display_name").getAsString(),
                Boolean.parseBoolean(jsonMap.get("is_bot").getAsString()),
                jsonMap.get("user_id").getAsString(),
                jsonMap.get("username").getAsString()
        );
    }

    public String getAvatarID() { return avatarID; }
    public String getDisplayName() { return displayName; }
    public boolean getIsBot() { return isBot; }
    public String getUserID() { return userID; }
    public String getUsername() { return username; }

    public static void main(String[] args) {
        System.out.println(getUserFromUsername("whitekap"));
    }
}
