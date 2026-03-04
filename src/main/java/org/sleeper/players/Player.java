package org.sleeper.players;

import java.util.List;
import java.util.Map;

public class Player {
//    private static Map<String, Player> players = PlayerJsonParser.getPlayerMap(false);

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
    private final int searchRank;
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
    private final int weight;
    private final String team;
    private final String birthCity;
    private final List<String> fantasyPositions;
    private final String teamAbbreviation;
    private final String birthDate;
    private final String oddsJamID;
    private final int yearsOfExperience;
    private final String swishID;
    private final String highSchool;
    private final Metadata metadata;
    private final int height;
    private final String sportsRadarID;
    private final String fantasyDataID;
    private final String searchFullName;
    private final int jerseyNumber;
    private final String kalshiID;
    private final List<String> competitions;
    private final int age;
    private final String injuryBodyPart;
    private final String statsID;
    private final String position;
    private final int newsUpdated;
    private final String depthChartOrder;
    private final String playerID;
    private final String hashtag;
    private final String injuryNotes;

    public Player(String practiceParticipation, String pandaScoreID, String practiceDescription, String espnID,
                  String gsisID, String searchFirstName, String depthChartPosition, boolean active, String fullName,
                  String yahooID, String teamChangedAt, int searchRank, String rotoworldID, String injuryStartDate,
                  String optaID, String college, String status, String lastName, String injuryStatus, String playerShard,
                  String searchLastName, String sport, String birthState, int weight, String team, String birthCity,
                  List<String> fantasyPositions, String teamAbbreviation, String birthDate, String oddsJamID,
                  int yearsOfExperience, String swishID, String highSchool, Metadata metadata, int height,
                  String sportsRadarID, String fantasyDataID, String searchFullName, int jerseyNumber, String kalshiID,
                  List<String> competitions, int age, String injuryBodyPart, String statsID, String position,
                  int newsUpdated, String depthChartOrder, String playerID, String hashtag, String injuryNotes) {
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
    public int getSearchRank() { return searchRank; }
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
    public int getWeight() { return weight; }
    public String getTeam() { return team; }
    public String getBirthCity() { return birthCity; }
    public List<String> getFantasyPositions() { return fantasyPositions; }
    public String getTeamAbbreviation() { return teamAbbreviation; }
    public String getBirthDate() { return birthDate; }
    public String getOddsJamID() { return oddsJamID; }
    public int getYearsOfExperience() { return yearsOfExperience; }
    public String getSwishID() { return swishID; }
    public String getHighSchool() { return highSchool; }
    public Metadata getMetadata() { return metadata; }
    public int getHeight() { return height; }
    public String getSportsRadarID() { return sportsRadarID; }
    public String getFantasyDataID() { return fantasyDataID; }
    public String getSearchFullName() { return searchFullName; }
    public int getJerseyNumber() { return jerseyNumber; }
    public String getKalshiID() { return kalshiID; }
    public List<String> getCompetitions() { return competitions; }
    public int getAge() { return age; }
    public String getInjuryBodyPart() { return injuryBodyPart; }
    public String getStatsID() { return statsID; }
    public String getPosition() { return position; }
    public int getNewsUpdated() { return newsUpdated; }
    public String getDepthChartOrder() { return depthChartOrder; }
    public String getPlayerID() { return playerID; }
    public String getHashtag() { return hashtag; }
    public String getInjuryNotes() { return injuryNotes; }
}
