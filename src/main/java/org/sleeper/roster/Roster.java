package org.sleeper.roster;

import com.google.gson.*;
import org.sleeper.players.Player;
import org.sleeper.roster.RosterRESTInteraction;

import java.util.*;

public class Roster {
    private final List<Player> starters;
    private final List<Player> players;
    private final RosterSettings settings;
    private final Record record;
    private final Points points;
    private final String rosterID;
    private final String ownerID;
    private final String leagueID;
    private final Metadata metadata;


    private Roster(List<Player> starters, List<Player> players, Metadata metadata,
                   RosterSettings settings, Record record, Points points, String rosterID,
                   String ownerID, String leagueID) {
        this.starters = Collections.unmodifiableList(starters);
        this.players = Collections.unmodifiableList(players);
        this.settings = settings;
        this.record = record;
        this.points = points;
        this.rosterID = rosterID;
        this.ownerID = ownerID;
        this.leagueID = leagueID;
        this.metadata = metadata;
    }

    public String toString() {
        return String.format("Roster({\n\tstarters: %s\n\tplayers: %s\n\tSettings: %s\n\tRecord: %s\n\tPoints: %s\n\trosterID: %s\n\townerID: %s\n\tleagueID: %s\n})",
                starters, players, settings, record, points, rosterID, ownerID, leagueID);
    }

    public List<Player> getStarters() { return starters; }
    public List<Player> getPlayers() { return players; }
    public RosterSettings getSettings() { return settings; }
    public Record getRecord() { return record; }
    public Points getPoints() { return points; }
    public String getRosterID() { return rosterID; }
    public String getOwnerID() { return ownerID; }
    public String getLeagueID() { return leagueID; }
    public Metadata getMetadata() { return metadata; }

    public static Roster getRosterFromJson(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();

        ArrayList<Player> startersList = new ArrayList<>();
        ArrayList<Player> playersList = new ArrayList<>();

        JsonArray startersJson = jsonMap.get("starters").getAsJsonArray();
        JsonArray playersJson = jsonMap.get("players").getAsJsonArray();

        for (JsonElement e : startersJson)
            startersList.add(Player.getPlayerByID(e.getAsString()));
        for (JsonElement e : playersJson)
            playersList.add(Player.getPlayerByID(e.getAsString()));

        return new Roster(
                startersList,
                playersList,
                Metadata.getMetadataFromJson(jsonMap.get("metadata")),
                RosterSettings.getSettingsFromJson(jsonMap.get("settings")),
                Record.getRecordFromSettingsJson(jsonMap.get("settings")),
                Points.getPointsFromSettingsJson(jsonMap.get("settings")),
                jsonMap.get("roster_id").getAsString(),
                jsonMap.get("owner_id").getAsString(),
                jsonMap.get("league_id").getAsString()
        );
    }



    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        System.out.println(RosterRESTInteraction.getLeagueRostersFromREST("1255633238693523456"));
        JsonArray rostersJson = JsonParser.parseString(RosterRESTInteraction.getLeagueRostersFromREST("1255633238693523456")).getAsJsonArray();
        ArrayList<Roster> rosters = new ArrayList<>();
        for (JsonElement r : rostersJson) {
            try {
//                System.out.println(gson.toJson(r));
                rosters.add(getRosterFromJson(r));
            } catch (Exception e) {
                System.out.printf("%s occurred because of %s", e.toString(), r.getAsString());
            }
        }
        System.out.println(rosters);
//        System.out.println(gson.toJson(rostersJson));
    }
}
