package org.sleeper.league;


import com.google.gson.*;
import org.sleeper.Sleeper;

import java.util.*;

public class League {
    public static final String myLeagueID = "1255633238693523456";

    private String leagueID;
    private String name;
    private String status;

    public League(String leagueID) {
        this.leagueID = leagueID;
    }

    public static League getLeague(String leagueID) {
        Map<String, JsonElement> fromJson = JsonParser.parseString(LeagueRESTInteraction.getLeagueJson(leagueID)).getAsJsonObject().asMap();

        return null;
        return new League(
            fromJson.get("name").getAsString(),
            fromJson.get("status").getAsString(),
            Metadata.getMetadata(fromJson.get("metadata"))
        );
    }
}
