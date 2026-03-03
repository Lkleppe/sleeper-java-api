package org.sleeper.user;

import com.google.gson.*;
import org.sleeper.HttpInteraction;
import org.sleeper.avatar.Avatar;
import org.sleeper.avatar.AvatarRESTInteraction;
import java.util.Map;

class UserRESTInteraction {

    static String getUserJsonByUsername(String username) {
        return HttpInteraction.getHttpResponse(userByUsernameURL(username));
    }

    static String getUserJsonByUserID(String userID) {
        return HttpInteraction.getHttpResponse(userByUserIDURL(userID));
    }

    static String getUserLeaguesJsonByUserID(String userID, String season) {
        return HttpInteraction.getHttpResponse(leaguesByUserIDURL(userID, season));
    }

    private static String userByUsernameURL(String username) {
        return String.format("https://api.sleeper.app/v1/user/%s", username);
    }

    private static String userByUserIDURL(String userID) {
        return String.format("https://api.sleeper.app/v1/user/%s", userID);
    }

    private static String leaguesByUserIDURL(String userID, String season) {
        return String.format("https://api.sleeper.app/v1/user/%s/leagues/nfl/%s", userID, season);
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

//        Map<String, JsonElement> toJson = JsonParser.parseString(getUserJsonByUserID("1255895130209001472")).getAsJsonObject().asMap();
        JsonArray toJson = JsonParser.parseString(getUserLeaguesJsonByUserID(User.getUserFromUsername("whitekap").getUserID(), "2025")).getAsJsonArray();
        System.out.println(gson.toJson(toJson));
//        System.out.println(AvatarRESTInteraction.getFullAvatarJson(toJson.get("avatar").getAsString()));
    }


}
