package org.sleeper.league;


import com.google.gson.*;
import org.sleeper.Sleeper;

import java.util.*;

public class League {
    public static final String myLeagueID = "1255633238693523456";

    private String leagueID;
    private String name;
    private String status;
    private Metadata metadata;
    private LeagueSettings settings;
    private int shard;
    private String season;
    private String seasonType;
    private String sport;
    private String lastMessageID;
    private ScoringSettings scoringSettings;
    private String lastAuthorDisplayName;
    private String lastAuthorID;
    private boolean lastAuthorIsBot;
    private long lastMessageTime;
    private String lastPinnedMessageID;
    private String draftID;
    private String[] rosterPositions;
    private String bracketID;
    private String loserBracketID;
    private int totalRosters;

    public League(
            String leagueID,
            String name,
            String status,
            Metadata metadata,
            LeagueSettings settings,
            int shard,
            String season,
            String seasonType,
            String sport,
            String lastMessageID,
            ScoringSettings scoringSettings,
            String lastAuthorDisplayName,
            String lastAuthorID,
            boolean lastAuthorIsBot,
            long lastMessageTime,
            String lastPinnedMessageID,
            String draftID,
            String[] rosterPositions,
            String bracketID,
            String loserBracketID,
            int totalRosters
    ) {
        this.leagueID = leagueID;
        this.name = name;
        this.status = status;
        this.metadata = metadata;
        this.settings = settings;
        this.shard = shard;
        this.season = season;
        this.seasonType = seasonType;
        this.sport = sport;
        this.lastMessageID = lastMessageID;
        this.scoringSettings = scoringSettings;
        this.lastAuthorDisplayName = lastAuthorDisplayName;
        this.lastAuthorID = lastAuthorID;
        this.lastAuthorIsBot = lastAuthorIsBot;
        this.lastMessageTime = lastMessageTime;
        this.lastPinnedMessageID = lastPinnedMessageID;
        this.draftID = draftID;
        this.rosterPositions = rosterPositions;
        this.bracketID = bracketID;
        this.loserBracketID = loserBracketID;
        this.totalRosters = totalRosters;
    }

    public String getLeagueID() { return leagueID; }
    public String getName() { return name; }
    public String getStatus() { return status; }
    public Metadata getMetadata() { return metadata; }
    public LeagueSettings getSettings() { return settings; }
    public int getShard() { return shard; }
    public String getSeason() { return season; }
    public String getSeasonType() { return seasonType; }
    public String getSport() { return sport; }
    public String getLastMessageID() { return lastMessageID; }
    public ScoringSettings getScoringSettings() { return scoringSettings; }
    public String getLastAuthorDisplayName() { return lastAuthorDisplayName; }
    public String getLastAuthorID() { return lastAuthorID; }
    public boolean getLastAuthorIsBot() { return lastAuthorIsBot; }
    public long getLastMessageTime() { return lastMessageTime; }
    public String getLastPinnedMessageID() { return lastPinnedMessageID; }
    public String getDraftID() { return draftID; }
    public String[] getRosterPositions() { return rosterPositions; }
    public String getBracketID() { return bracketID; }
    public String getLoserBracketID() { return loserBracketID; }
    public int getTotalRosters() { return totalRosters; }

    public static League getLeague(String leagueID) {
        Map<String, JsonElement> fromJson = JsonParser.parseString(LeagueRESTInteraction.getLeagueJson(leagueID)).getAsJsonObject().asMap();

        JsonArray rosterPositionsJson = fromJson.get("roster_positions").getAsJsonArray();
        String[] rosterPositions = new String[rosterPositionsJson.size()];
        for (int i = 0; i < rosterPositionsJson.size(); ++i)
            rosterPositions[i] = rosterPositionsJson.get(i).getAsString();

        return new League(
                leagueID,
                fromJson.get("name").getAsString(),
                fromJson.get("status").getAsString(),
                Metadata.getMetadata(fromJson.get("metadata")),
                LeagueSettings.getSettings(fromJson.get("settings")),
                fromJson.get("shard").getAsInt(),
                fromJson.get("season").getAsString(),
                fromJson.get("season_type").getAsString(),
                fromJson.get("sport").getAsString(),
                fromJson.get("last_message_id").getAsString(),
                ScoringSettings.getSettings(fromJson.get("scoring_settings")),
                fromJson.get("last_author_display_name").getAsString(),
                fromJson.get("last_author_id").getAsString(),
                fromJson.get("last_author_is_bot").getAsBoolean(),
                fromJson.get("last_message_time").getAsLong(),
                fromJson.get("last_pinned_message_id").getAsString(),
                fromJson.get("draft_id").getAsString(),
                rosterPositions,
                fromJson.get("bracket_id").getAsString(),
                fromJson.get("loser_bracket_id").getAsString(),
                fromJson.get("total_rosters").getAsInt()
        );
    }

    public static void main(String[] args) {
        League league = getLeague(League.myLeagueID);
//        System.out.println(league.getDraftID());
    }
}
