package org.sleeper.roster;

import com.google.gson.*;
import org.sleeper.HttpInteraction;
import org.sleeper.league.League;
import org.sleeper.players.Player;
import org.sleeper.user.User;

public class RosterRESTInteraction {

    public static String getLeagueRostersFromREST(String leagueID) {
        return HttpInteraction.getHttpResponse(getLeagueRostersURL(leagueID));
    }

    private static String getLeagueRostersURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/rosters", leagueID);
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonArray jsonRosters = JsonParser.parseString(getLeagueRostersFromREST(League.myLeagueID)).getAsJsonArray();
        System.out.println(gson.toJson(jsonRosters));
//        System.out.println(jsonRosters);
//        for (JsonElement json : jsonRosters) {
//            JsonObject asObject = json.getAsJsonObject();
//            JsonArray players = asObject.get("players").getAsJsonArray();
//            String username = User.getUserFromUserID(asObject.get("owner_id").getAsString()).getUsername();
//            System.out.printf("%s's Team:\n", username);
//            for (JsonElement j2 : players) {
//                System.out.println(Player.getPlayerByID(j2.getAsString()).getFullName());
//            }
//            System.out.println("\n\n");
//        }
    }
}
