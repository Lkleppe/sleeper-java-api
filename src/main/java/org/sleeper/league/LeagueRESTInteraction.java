package org.sleeper.league;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.sleeper.HttpInteraction;

class LeagueRESTInteraction {

    public static String getLeagueJson(String leagueID) {
        return HttpInteraction.getHttpResponse(getLeagueURL(leagueID));
    }

    public static String getRostersJson(String leagueID) {
        return HttpInteraction.getHttpResponse(getRostersURL(leagueID));
    }

    public static String getUsersJson(String leagueID) {
        return HttpInteraction.getHttpResponse(getUsersURL(leagueID));
    }

    public static String getMatchupsJsonByWeek(String leagueID, int week) {
        return HttpInteraction.getHttpResponse(getMatchupsByWeekURL(leagueID, week));
    }

    public static String getWinnersBracketJson(String leagueID) {
        return HttpInteraction.getHttpResponse(getWinnersBracketURL(leagueID));
    }

    public static String getLosersBracketJson(String leagueID) {
        return HttpInteraction.getHttpResponse(getLosersBracketURL(leagueID));
    }

    public static String getTransactionsJson(String leagueID, int week) {
        return HttpInteraction.getHttpResponse(getTransactionsURL(leagueID, week));
    }

    public static String getTradedPicksJson(String leagueID) {
        return HttpInteraction.getHttpResponse(getTradedPicksURL(leagueID));
    }

    private static String getLeagueURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s", leagueID);
    }

    private static String getRostersURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/rosters", leagueID);
    }

    private static String getUsersURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/users", leagueID);
    }

    private static String getMatchupsByWeekURL(String leagueID, int week) {
        return String.format("https://api.sleeper.app/v1/league/<%s/matchups/%d", leagueID, week);
    }

    private static String getWinnersBracketURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/winners_bracket", leagueID);
    }

    private static String getLosersBracketURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/winners_bracket", leagueID);
    }

    private static String getTransactionsURL(String leagueID, int week) {
        return String.format("https://api.sleeper.app/v1/league/%s/transactions/%d", leagueID, week);
    }

    private static String getTradedPicksURL(String leagueID) {
        return String.format("https://api.sleeper.app/v1/league/%s/traded_picks", leagueID);
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement toJson = JsonParser.parseString(getLeagueJson(League.myLeagueID));
//        JsonElement toJson = JsonParser.parseString(getRostersJson(League.myLeagueID));
//        JsonElement toJson = JsonParser.parseString(getWinnersBracketJson(League.myLeagueID));
        System.out.println(gson.toJson(toJson));
    }
}
