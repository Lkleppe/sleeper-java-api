package org.sleeper.players;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.sleeper.HttpInteraction;

import java.util.Map;

public class PlayerRESTInteraction {

    public static String getAllPlayersJson() {
        return HttpInteraction.getHttpResponse(getAllPlayersURL());
    }

    private static String getAllPlayersURL() {
        return "https://api.sleeper.app/v1/players/nfl";
    }

    public static void main(String[] args) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Map<String, JsonElement> jsonMap = JsonParser.parseString(getAllPlayersJson()).getAsJsonObject().asMap();
        System.out.println(jsonMap.get("5063"));
    }
}
