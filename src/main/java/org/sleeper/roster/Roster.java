package org.sleeper.roster;

import com.google.gson.*;
import org.sleeper.roster.RosterRESTInteraction;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Roster {
    private List<String> starters;
    private List<String> players;
    RosterSettings settings;
    Record record;
    Points points;
    String rosterID;
    String ownerID;
    String leagueID;

    private Roster(String[] starters, String[] players, int waiverPosition, int waiverBudgetUsed,
                   int totalMoves, int wins, int ties, int losses, int fpts, int fptsDecimal,
                   int fptsAgainst, int fptsAgainstDecimal, String rosterID, String ownerID, String leagueID) {
        this.starters = Arrays.asList(starters);
        this.players = Arrays.asList(players);
        settings = new RosterSettings(waiverPosition, waiverBudgetUsed, totalMoves);
        record = new Record(wins, ties, losses);
        points = new Points(fpts, fptsAgainst, fptsDecimal, fptsAgainstDecimal);
        this.rosterID = rosterID;
        this.ownerID = ownerID;
        this.leagueID = leagueID;
    }

    public String toString() {
        return String.format("Roster({\n\tstarters: %s\n\tplayers: %s\n\tSettings: %s\n\tRecord: %s\n\tPoints: %s\n\trosterID: %s\n\townerID: %s\n\tleagueID: %s\n})",
                starters, players, settings, record, points, rosterID, ownerID, leagueID);
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        System.out.println(RosterRESTInteraction.getLeagueRostersFromREST("1255633238693523456"));
        JsonArray rostersJson = JsonParser.parseString(RosterRESTInteraction.getLeagueRostersFromREST("1255633238693523456")).getAsJsonArray();
        System.out.println(gson.toJson(rostersJson));
    }
}
