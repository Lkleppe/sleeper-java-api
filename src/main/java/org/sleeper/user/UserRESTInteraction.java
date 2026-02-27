package org.sleeper.user;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.sleeper.HttpInteraction;
import com.google.gson.Gson;
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

    private static String userByUsernameURL(String username) {
        return String.format("https://api.sleeper.app/v1/user/%s", username);
    }

    private static String userByUserIDURL(String userID) {
        return String.format("https://api.sleeper.app/v1/user/%s", userID);
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Map<String, JsonElement> toJson = JsonParser.parseString(getUserJsonByUserID("1255895130209001472")).getAsJsonObject().asMap();
        System.out.println(gson.toJson(toJson));
//        System.out.println(AvatarRESTInteraction.getFullAvatarJson(toJson.get("avatar").getAsString()));
    }


}
