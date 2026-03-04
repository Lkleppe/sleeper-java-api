package org.sleeper.players;

import com.google.gson.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private static final Map<String, Player> players = getPlayerMap();

    private final String practiceParticipation;
    private final String pandaScoreID;
    private final String practiceDescription;
    private final String espnID;
    private final String gsisID;
    private final String searchFirstName;
    private final String depthChartPosition;
    private final boolean active;
    private final String fullName;
    private final String yahooID;
    private final String teamChangedAt;
    private final String searchRank;
    private final String rotoworldID;
    private final String injuryStartDate;
    private final String optaID;
    private final String college;
    private final String status;
    private final String lastName;
    private final String injuryStatus;
    private final String playerShard;
    private final String searchLastName;
    private final String sport;
    private final String birthState;
    private final String weight;
    private final String team;
    private final String birthCity;
    private final List<String> fantasyPositions;
    private final String teamAbbreviation;
    private final String birthDate;
    private final String oddsJamID;
    private final String yearsOfExperience;
    private final String swishID;
    private final String highSchool;
    private final Metadata metadata;
    private final String height;
    private final String sportsRadarID;
    private final String fantasyDataID;
    private final String searchFullName;
    private final String jerseyNumber;
    private final String kalshiID;
    private final List<String> competitions;
    private final String age;
    private final String injuryBodyPart;
    private final String statsID;
    private final String position;
    private final String newsUpdated;
    private final String depthChartOrder;
    private final String playerID;
    private final String hashtag;
    private final String injuryNotes;

    public Player(String practiceParticipation, String pandaScoreID, String practiceDescription, String espnID,
                  String gsisID, String searchFirstName, String depthChartPosition, boolean active, String fullName,
                  String yahooID, String teamChangedAt, String searchRank, String rotoworldID, String injuryStartDate,
                  String optaID, String college, String status, String lastName, String injuryStatus, String playerShard,
                  String searchLastName, String sport, String birthState, String weight, String team, String birthCity,
                  List<String> fantasyPositions, String teamAbbreviation, String birthDate, String oddsJamID,
                  String yearsOfExperience, String swishID, String highSchool, Metadata metadata, String height,
                  String sportsRadarID, String fantasyDataID, String searchFullName, String jerseyNumber, String kalshiID,
                  List<String> competitions, String age, String injuryBodyPart, String statsID, String position,
                  String newsUpdated, String depthChartOrder, String playerID, String hashtag, String injuryNotes) {
        this.practiceParticipation = practiceParticipation;
        this.pandaScoreID = pandaScoreID;
        this.practiceDescription = practiceDescription;
        this.espnID = espnID;
        this.gsisID = gsisID;
        this.searchFirstName = searchFirstName;
        this.depthChartPosition = depthChartPosition;
        this.active = active;
        this.fullName = fullName;
        this.yahooID = yahooID;
        this.teamChangedAt = teamChangedAt;
        this.searchRank = searchRank;
        this.rotoworldID = rotoworldID;
        this.injuryStartDate = injuryStartDate;
        this.optaID = optaID;
        this.college = college;
        this.status = status;
        this.lastName = lastName;
        this.injuryStatus = injuryStatus;
        this.playerShard = playerShard;
        this.searchLastName = searchLastName;
        this.sport = sport;
        this.birthState = birthState;
        this.weight = weight;
        this.team = team;
        this.birthCity = birthCity;
        this.fantasyPositions = fantasyPositions;
        this.teamAbbreviation = teamAbbreviation;
        this.birthDate = birthDate;
        this.oddsJamID = oddsJamID;
        this.yearsOfExperience = yearsOfExperience;
        this.swishID = swishID;
        this.highSchool = highSchool;
        this.metadata = metadata;
        this.height = height;
        this.sportsRadarID = sportsRadarID;
        this.fantasyDataID = fantasyDataID;
        this.searchFullName = searchFullName;
        this.jerseyNumber = jerseyNumber;
        this.kalshiID = kalshiID;
        this.competitions = competitions;
        this.age = age;
        this.injuryBodyPart = injuryBodyPart;
        this.statsID = statsID;
        this.position = position;
        this.newsUpdated = newsUpdated;
        this.depthChartOrder = depthChartOrder;
        this.playerID = playerID;
        this.hashtag = hashtag;
        this.injuryNotes = injuryNotes;
    }

    public static Player getPlayerByID(String playerID) {
        return players.get(playerID);
    }

    private static Map<String, Player> getPlayerMap() {
        Map<String, Player> result = new HashMap<>();
        JsonObject jsonObject = JsonParser.parseString(PlayerRESTInteraction.getAllPlayersJson()).getAsJsonObject();

        for (String jsonKey : jsonObject.keySet()) {
            result.put(jsonKey, getPlayerFromJson(jsonObject.get(jsonKey)));
        }
        return result;
    }

    public String getPracticeParticipation() { return practiceParticipation; }
    public String getPandaScoreID() { return pandaScoreID; }
    public String getPracticeDescription() { return practiceDescription; }
    public String getEspnID() { return espnID; }
    public String getGsisID() { return gsisID; }
    public String getSearchFirstName() { return searchFirstName; }
    public String getDepthChartPosition() { return depthChartPosition; }
    public boolean isActive() { return active; }
    public String getFullName() { return fullName; }
    public String getYahooID() { return yahooID; }
    public String getTeamChangedAt() { return teamChangedAt; }
    public String getSearchRank() { return searchRank; }
    public String getRotoworldID() { return rotoworldID; }
    public String getInjuryStartDate() { return injuryStartDate; }
    public String getOptaID() { return optaID; }
    public String getCollege() { return college; }
    public String getStatus() { return status; }
    public String getLastName() { return lastName; }
    public String getInjuryStatus() { return injuryStatus; }
    public String getPlayerShard() { return playerShard; }
    public String getSearchLastName() { return searchLastName; }
    public String getSport() { return sport; }
    public String getBirthState() { return birthState; }
    public String getWeight() { return weight; }
    public String getTeam() { return team; }
    public String getBirthCity() { return birthCity; }
    public List<String> getFantasyPositions() { return fantasyPositions; }
    public String getTeamAbbreviation() { return teamAbbreviation; }
    public String getBirthDate() { return birthDate; }
    public String getOddsJamID() { return oddsJamID; }
    public String getYearsOfExperience() { return yearsOfExperience; }
    public String getSwishID() { return swishID; }
    public String getHighSchool() { return highSchool; }
    public Metadata getMetadata() { return metadata; }
    public String getHeight() { return height; }
    public String getSportsRadarID() { return sportsRadarID; }
    public String getFantasyDataID() { return fantasyDataID; }
    public String getSearchFullName() { return searchFullName; }
    public String getJerseyNumber() { return jerseyNumber; }
    public String getKalshiID() { return kalshiID; }
    public List<String> getCompetitions() { return competitions; }
    public String getAge() { return age; }
    public String getInjuryBodyPart() { return injuryBodyPart; }
    public String getStatsID() { return statsID; }
    public String getPosition() { return position; }
    public String getNewsUpdated() { return newsUpdated; }
    public String getDepthChartOrder() { return depthChartOrder; }
    public String getPlayerID() { return playerID; }
    public String getHashtag() { return hashtag; }
    public String getInjuryNotes() { return injuryNotes; }

    public static Player getPlayerFromJson(JsonElement json) {
        Map<String, JsonElement> jsonMap = json.getAsJsonObject().asMap();

        JsonElement practiceParticipation = jsonMap.get("practice_participation");
        JsonElement pandaScoreID = jsonMap.get("pandascore_id");
        JsonElement practiceDescription = jsonMap.get("practice_description");
        JsonElement espnID = jsonMap.get("espn_id");
        JsonElement gsisID = jsonMap.get("gsis_id");
        JsonElement searchFirstName = jsonMap.get("search_first_name");
        JsonElement depthChartPosition = jsonMap.get("depth_chart_position");
        JsonElement active = jsonMap.get("active");
        JsonElement fullName = jsonMap.get("full_name");
        JsonElement yahooID = jsonMap.get("yahoo_id");
        JsonElement teamChangedAt = jsonMap.get("team_changed_at");
        JsonElement searchRank = jsonMap.get("search_rank");
        JsonElement rotoworldID = jsonMap.get("rotoworld_id");
        JsonElement injuryStartDate = jsonMap.get("injury_start_date");
        JsonElement optaID = jsonMap.get("opta_id");
        JsonElement college = jsonMap.get("college");
        JsonElement status = jsonMap.get("status");
        JsonElement lastName = jsonMap.get("last_name");
        JsonElement injuryStatus = jsonMap.get("injury_status");
        JsonElement playerShard = jsonMap.get("player_shard");
        JsonElement searchLastName = jsonMap.get("search_last_name");
        JsonElement sport = jsonMap.get("sport");
        JsonElement birthState = jsonMap.get("birth_state");
        JsonElement weight = jsonMap.get("weight");
        JsonElement team = jsonMap.get("team");
        JsonElement birthCity = jsonMap.get("birth_city");
        JsonElement fantasyPositionsJson = jsonMap.get("fantasy_positions");
        JsonElement teamAbbreviation = jsonMap.get("team_abbr");
        JsonElement birthDate = jsonMap.get("birth_date");
        JsonElement oddsJamID = jsonMap.get("oddsjam_id");
        JsonElement yearsOfExperience = jsonMap.get("years_exp");
        JsonElement swishID = jsonMap.get("swish_id");
        JsonElement highSchool = jsonMap.get("high_school");
        JsonElement metadataJson = jsonMap.get("metadata");
        JsonElement height = jsonMap.get("height");
        JsonElement sportsRadarID = jsonMap.get("sportradar_id");
        JsonElement fantasyDataID = jsonMap.get("fantasy_data_id");
        JsonElement searchFullName = jsonMap.get("search_full_name");
        JsonElement jerseyNumber = jsonMap.get("number");
        JsonElement kalshiID = jsonMap.get("kalshi_id");
        JsonElement competitionsJson = jsonMap.get("competitions");
        JsonElement age = jsonMap.get("age");
        JsonElement injuryBodyPart = jsonMap.get("injury_body_part");
        JsonElement statsID = jsonMap.get("stats_id");
        JsonElement position = jsonMap.get("position");
        JsonElement newsUpdated = jsonMap.get("news_updated");
        JsonElement depthChartOrder = jsonMap.get("depth_chart_order");
        JsonElement playerID = jsonMap.get("player_id");
        JsonElement hashtag = jsonMap.get("hashtag");
        JsonElement injuryNotes = jsonMap.get("injury_notes");

        List<String> fantasyPositions = new ArrayList<>();
        if (fantasyPositionsJson != null && !fantasyPositionsJson.isJsonNull())
            for (JsonElement e : fantasyPositionsJson.getAsJsonArray())
                fantasyPositions.add(e.getAsString());

        List<String> competitions = new ArrayList<>();
        if (competitionsJson != null && !competitionsJson.isJsonNull())
            for (JsonElement e : competitionsJson.getAsJsonArray())
                competitions.add(e.getAsString());

        String firstName = jsonMap.get("first_name") != null && !jsonMap.get("first_name").isJsonNull()
                ? jsonMap.get("first_name").getAsString() : null;
        String lastNameStr = lastName != null && !lastName.isJsonNull() ? lastName.getAsString() : null;

        return new Player(
                practiceParticipation != null && !practiceParticipation.isJsonNull() ? practiceParticipation.getAsString() : null,
                pandaScoreID != null && !pandaScoreID.isJsonNull() ? pandaScoreID.getAsString() : null,
                practiceDescription != null && !practiceDescription.isJsonNull() ? practiceDescription.getAsString() : null,
                espnID != null && !espnID.isJsonNull() ? espnID.getAsString() : null,
                gsisID != null && !gsisID.isJsonNull() ? gsisID.getAsString() : null,
                searchFirstName != null && !searchFirstName.isJsonNull() ? searchFirstName.getAsString() : null,
                depthChartPosition != null && !depthChartPosition.isJsonNull() ? depthChartPosition.getAsString() : null,
                active != null && !active.isJsonNull() && active.getAsBoolean(),
                fullName != null && !fullName.isJsonNull() ? fullName.getAsString()
                        : (firstName != null && lastNameStr != null ? firstName + " " + lastNameStr : null),
                yahooID != null && !yahooID.isJsonNull() ? yahooID.getAsString() : null,
                teamChangedAt != null && !teamChangedAt.isJsonNull() ? teamChangedAt.getAsString() : null,
                searchRank != null && !searchRank.isJsonNull() ? searchRank.getAsString() : null,
                rotoworldID != null && !rotoworldID.isJsonNull() ? rotoworldID.getAsString() : null,
                injuryStartDate != null && !injuryStartDate.isJsonNull() ? injuryStartDate.getAsString() : null,
                optaID != null && !optaID.isJsonNull() ? optaID.getAsString() : null,
                college != null && !college.isJsonNull() ? college.getAsString() : null,
                status != null && !status.isJsonNull() ? status.getAsString() : null,
                lastNameStr,
                injuryStatus != null && !injuryStatus.isJsonNull() ? injuryStatus.getAsString() : null,
                playerShard != null && !playerShard.isJsonNull() ? playerShard.getAsString() : null,
                searchLastName != null && !searchLastName.isJsonNull() ? searchLastName.getAsString() : null,
                sport != null && !sport.isJsonNull() ? sport.getAsString() : null,
                birthState != null && !birthState.isJsonNull() ? birthState.getAsString() : null,
                weight != null && !weight.isJsonNull() ? weight.getAsString() : null,
                team != null && !team.isJsonNull() ? team.getAsString() : null,
                birthCity != null && !birthCity.isJsonNull() ? birthCity.getAsString() : null,
                fantasyPositions,
                teamAbbreviation != null && !teamAbbreviation.isJsonNull() ? teamAbbreviation.getAsString() : null,
                birthDate != null && !birthDate.isJsonNull() ? birthDate.getAsString() : null,
                oddsJamID != null && !oddsJamID.isJsonNull() ? oddsJamID.getAsString() : null,
                yearsOfExperience != null && !yearsOfExperience.isJsonNull() ? yearsOfExperience.getAsString() : null,
                swishID != null && !swishID.isJsonNull() ? swishID.getAsString() : null,
                highSchool != null && !highSchool.isJsonNull() ? highSchool.getAsString() : null,
                metadataJson != null && !metadataJson.isJsonNull() ? Metadata.getMetadataFromJson(metadataJson) : null,
                height != null && !height.isJsonNull() ? height.getAsString() : null,
                sportsRadarID != null && !sportsRadarID.isJsonNull() ? sportsRadarID.getAsString() : null,
                fantasyDataID != null && !fantasyDataID.isJsonNull() ? fantasyDataID.getAsString() : null,
                searchFullName != null && !searchFullName.isJsonNull() ? searchFullName.getAsString() : null,
                jerseyNumber != null && !jerseyNumber.isJsonNull() ? jerseyNumber.getAsString() : null,
                kalshiID != null && !kalshiID.isJsonNull() ? kalshiID.getAsString() : null,
                competitions,
                age != null && !age.isJsonNull() ? age.getAsString() : null,
                injuryBodyPart != null && !injuryBodyPart.isJsonNull() ? injuryBodyPart.getAsString() : null,
                statsID != null && !statsID.isJsonNull() ? statsID.getAsString() : null,
                position != null && !position.isJsonNull() ? position.getAsString() : null,
                newsUpdated != null && !newsUpdated.isJsonNull() ? newsUpdated.getAsString() : null,
                depthChartOrder != null && !depthChartOrder.isJsonNull() ? depthChartOrder.getAsString() : null,
                playerID != null && !playerID.isJsonNull() ? playerID.getAsString() : null,
                hashtag != null && !hashtag.isJsonNull() ? hashtag.getAsString() : null,
                injuryNotes != null && !injuryNotes.isJsonNull() ? injuryNotes.getAsString() : null
        );
    }

    public String toString() {
        return "Player{" +
                "playerID='" + playerID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", team='" + team + '\'' +
                ", status='" + status + '\'' +
                ", active=" + active +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", jerseyNumber='" + jerseyNumber + '\'' +
                ", sport='" + sport + '\'' +
                ", college='" + college + '\'' +
                ", highSchool='" + highSchool + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", birthCity='" + birthCity + '\'' +
                ", birthState='" + birthState + '\'' +
                ", birthCountry='" + birthState + '\'' +
                ", yearsOfExperience='" + yearsOfExperience + '\'' +
                ", fantasyPositions=" + fantasyPositions +
                ", injuryStatus='" + injuryStatus + '\'' +
                ", injuryBodyPart='" + injuryBodyPart + '\'' +
                ", injuryStartDate='" + injuryStartDate + '\'' +
                ", injuryNotes='" + injuryNotes + '\'' +
                ", depthChartPosition='" + depthChartPosition + '\'' +
                ", depthChartOrder='" + depthChartOrder + '\'' +
                ", hashtag='" + hashtag + '\'' +
                ", sportsRadarID='" + sportsRadarID + '\'' +
                ", espnID='" + espnID + '\'' +
                ", yahooID='" + yahooID + '\'' +
                ", fantasyDataID='" + fantasyDataID + '\'' +
                ", statsID='" + statsID + '\'' +
                ", metadata=" + metadata +
                '}';
    }
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(getPlayerMap().get("4034")));
    }

}
