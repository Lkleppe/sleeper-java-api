package org.sleeper.players;

import com.google.gson.*;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

import org.sleeper.Sleeper;

public class PlayerJsonParser {
    private static Gson gson = new Gson();

    public static JsonObject convertJsonToObject(String json) {
        return JsonParser.parseString(json).getAsJsonObject();
    }

    public static Map<String, Player> getPlayerMap(boolean isHashMap) {
        Map<String, Player> playerMap = isHashMap ?
                                            new HashMap<String, Player>()
                                            : new TreeMap<String, Player>();

        try {
            JsonObject players = convertJsonToObject(Sleeper.Builder().getPlayers());
            for (var entry : players.asMap().entrySet()) {
                Player p = convertJsonToPlayer(entry.getKey(), entry.getValue());
                playerMap.put(p.getPlayerID(), p);
//                System.out.println(p);
            }
            return playerMap;
        } catch (Exception e) {
            System.out.println(e);
            return playerMap;
        }

    }

    private static Player convertJsonToPlayer(String playerID, JsonElement entry) {
        JsonObject obj = entry.getAsJsonObject();

        JsonElement nameElement = obj.get("full_name");

        if (nameElement == null || nameElement.isJsonNull()) {
            return new Player("no name", playerID); // skip players without names
        }

        return new Player(nameElement.getAsString(), playerID);
    }

    public static void main(String[] args) throws Exception {
        String leagueID = "1255633238693523456";
    }
}
