package org.sleeper.league;


import com.google.gson.*;
import org.sleeper.Sleeper;

import java.util.*;

public class League {
    public static final String leagueID = "1255633238693523456";
    private static Gson gson = new Gson();
//    private String leagueID;
    Sleeper restInteractor;

    public League(String leagueID) {
//        this.leagueID = leagueID;
        restInteractor = new Sleeper(leagueID);
    }

    private static List<String> getMembers(String leagueID) {
        ArrayList<String> members = new ArrayList<String>();
        Sleeper restInteractor = new Sleeper(leagueID);
        String restResponse = "";
        try {
            restResponse = restInteractor.getLeagueUsers();
//            System.out.println(restResponse);
        } catch (Exception e) {
            System.out.println(e);
        }

        JsonArray responseToJson = JsonParser.parseString(restResponse).getAsJsonArray();
//        System.out.println(responseToJson);
        for (JsonElement element : responseToJson)
            members.add(element.getAsJsonObject().get("display_name").getAsString());

        return members;
    }

    public static void main(String[] args) {
        System.out.println(League.getMembers(leagueID));
    }
}
